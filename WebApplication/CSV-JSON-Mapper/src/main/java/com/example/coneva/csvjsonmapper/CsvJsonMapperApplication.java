package com.example.coneva.csvjsonmapper;
import com.opencsv.exceptions.CsvException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@SpringBootApplication
public class CsvJsonMapperApplication {

    private static final Logger logger = LoggerFactory.getLogger(CsvJsonMapperApplication.class);

    public static void main(String[] args) throws IOException, CsvException {
        SpringApplication.run(CsvJsonMapperApplication.class, args);


        // ZoneDateTime
        Date now = new Date();
        ZonedDateTime time = now.toInstant().atZone(ZoneId.systemDefault());
//        System.out.println(time.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        logger.info("time with system's default offset");
        logger.info(time.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));

        String dateString  = "2022-05-11T00:30:00.000000+02:00";

        OffsetDateTime dateTime = OffsetDateTime.parse(dateString);

        logger.info("printing the date " + dateTime);

        logger.info(String.valueOf(dateTime));


    }

}
