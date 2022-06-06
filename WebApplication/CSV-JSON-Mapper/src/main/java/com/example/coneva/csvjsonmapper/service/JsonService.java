package com.example.coneva.csvjsonmapper.service;

import com.example.coneva.csvjsonmapper.controller.UploadController;
import com.example.coneva.csvjsonmapper.model.Schedule;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class JsonService {

    private final Logger logger = LoggerFactory.getLogger(UploadController.class);

    private List<Schedule> schedule = new ArrayList<>();

    public void updateSchedule(List<Schedule> schedule){
        this.schedule = schedule;
    }

    public String returnJson() throws IOException {

        // create object mapper instance
        ObjectMapper mapper = new ObjectMapper();

        // create an instance of DefaultPrettyPrinter
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        // convert Schedule object to JSON file
        writer.writeValue(Paths.get("schedule.json").toFile(), schedule);

        // convert Schedule object to JSON
        String json = new ObjectMapper().writeValueAsString(schedule);

        // print JSON string
        logger.info(json);

        return json;

    }
}
