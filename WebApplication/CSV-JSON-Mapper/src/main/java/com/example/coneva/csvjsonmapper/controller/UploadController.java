package com.example.coneva.csvjsonmapper.controller;

import com.opencsv.bean.CsvToBean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

@RestController
//@Controller
public class UploadController {


    @GetMapping("/")
//    @ResponseBody
    public String showWelcome(){
        return "Your are viewing the root page";
    }

    @PostMapping("upload-csv-file")
    public String uploadCSVFile(@RequestParam("file") MultipartFile file, Model model){


        // validate the file

        if (file.isEmpty()){
            model.addAttribute("message", "please select a CSV file to upload.");
            model.addAttribute("status", false);
        } else {

            // parse CSV file to create a list of "Schedule" objects

            try(Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {

                CsvToBean<com.example.coneva.csvjsonmapper.model.Schedule>

            } catch (IOException e) {
                e.printStackTrace();
            }

        }



    }


}
