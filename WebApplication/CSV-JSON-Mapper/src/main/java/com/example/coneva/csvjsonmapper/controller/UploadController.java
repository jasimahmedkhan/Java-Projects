package com.example.coneva.csvjsonmapper.controller;

import com.example.coneva.csvjsonmapper.model.Schedule;

import com.example.coneva.csvjsonmapper.service.JsonService;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

import java.util.List;

@Controller
//@RestController
public class UploadController {

    private final Logger logger = LoggerFactory.getLogger(UploadController.class);

    @Autowired
    JsonService jsonService;

//    @GetMapping("/")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    //    @ResponseBody
    public String showWelcome(){
//        return "forward:/index.html";
        return "index";
    }

//    @PostMapping("upload-csv-file")

    @RequestMapping(value = "/status", method = RequestMethod.POST)
    @ResponseBody
    public String showStatus(){
        return "Status Working";
    }

    @RequestMapping(value = "/upload-csv-file", method = RequestMethod.POST)
//    @PostMapping("/upload-csv-file")
    public String uploadCSVFile(@RequestParam("file") MultipartFile file, Model model){

        // validate the file

        if (file.isEmpty()){
            model.addAttribute("message", "please select a CSV file to upload.");
            model.addAttribute("status", false);
        } else {

            // parse CSV file to create a list of "Schedule" objects

            try(Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream(), StandardCharsets.UTF_8))) {

                CsvToBean<Schedule> csvToBean = new CsvToBeanBuilder(reader)
                        .withType(Schedule.class)
//                        .withSeparator(',')
                        .withIgnoreLeadingWhiteSpace(true)
                        .withIgnoreEmptyLine(true)
                        .build();

                // convert CsvToBean object to list of users
                List<Schedule> schedule = csvToBean.parse();

                // TODO: save users in DB?

                // save schedule list on model
                model.addAttribute("schedule", schedule);
                model.addAttribute("status", true);

                // Logging the values
                logger.info("printing the first one");
                logger.info(schedule.get(0).getTimestamp_start());
//                logger.info(String.valueOf(OffsetDateTime.of(LocalDateTime.parse(schedule.get(0).getTimestamp_start(),
//                        DateTimeFormatter.ISO_DATE_TIME), ZoneOffset.UTC)));

                // update the JsonService schedules
                jsonService.updateSchedule(schedule);


            } catch (IOException e) {
                model.addAttribute("message", "An error occurred while processing the CSV file.");
                model.addAttribute("status", false);
                e.printStackTrace();
            }

        }

        return "file-upload-status";

    }


}









//                Object value = schedule.get(0).getTimestamp_start();
//
//                if (value.getClass() == Integer.class) {
//                    System.out.println("This is an Integer");
//                }
//                else if (value.getClass() == String.class) {
//                    System.out.println("This is a String");
//                }
//                else if (value.getClass() == Float.class) {
//                    System.out.println("This is a Float");
//                }
