package com.example.coneva.csvjsonmapper;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileReader;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class CsvJsonMapperApplication {

    private static final Logger logger = LoggerFactory.getLogger(CsvJsonMapperApplication.class);

    public static void main(String[] args) throws IOException, CsvException {
        SpringApplication.run(CsvJsonMapperApplication.class, args);


        // CSV is parsing properly
//        String fileName = "/home/jasim/JavaProjects/WebApplication/CSV-JSON-Mapper/src/main/resources/schedule_entries.csv"
//        try (CSVReader reader = new CSVReader( new FileReader(fileName))) {
//            List<String[]> r = reader.readAll();
//            r.forEach(x -> System.out.println(Arrays.toString(x)));
//        }


        // ZoneDateTime
        Date now = new Date();
        ZonedDateTime time = now.toInstant().atZone(ZoneId.systemDefault());
//        System.out.println(time.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        logger.info("time with system's default offset");
        logger.info(time.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));

        String dateString  = "2022-05-11T00:30:00.000000+02:00";

//        logger.info(String.valueOf(OffsetDateTime.parse(,
//                DateTimeFormatter.ISO_OFFSET_DATE_TIME)));

//        OffsetDateTime date = OffsetDateTime.of(LocalDateTime.from(ZonedDateTime.parse(dateString,
//                DateTimeFormatter.ISO_OFFSET_DATE_TIME)), ZoneOffset.UTC);
//        logger.info(String.valueOf(date));

//        OffsetDateTime date = OffsetDateTime.from(ZonedDateTime.parse(dateString,
//                DateTimeFormatter.ISO_OFFSET_DATE_TIME));

//        OffsetDateTime date = OffsetDateTime.from(ZonedDateTime.parse(dateString,
//                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSZZZZZ")));

        // Convert or Parse String Date format to desired date pattern string
//        String date = Instant.parse("2022-05-11T00:30:00.000000+02:00")
//                .atOffset(ZoneOffset.UTC)
//                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

//        String dateTime = String.valueOf(Instant.parse(dateString)
//                .atOffset(ZoneOffset.UTC)
//                .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));

        OffsetDateTime dateTime = OffsetDateTime.parse(dateString);
//                .atZoneSameInstant(ZoneOffset.UTC)
//                .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);

        // to offset the zone
//        OffsetDateTime date = OffsetDateTime.from(ZonedDateTime.parse(dateString,
//                DateTimeFormatter.ISO_OFFSET_DATE_TIME).toInstant().atZone(ZoneOffset.UTC));
        logger.info("printing the date " + dateTime);

        logger.info(String.valueOf(dateTime));
//        logger.info(String.valueOf(date));




//        String value = "2022-05-11 00:30:00.000000 +02:00";
//        String dataValue = value.replaceAll("\\s+","");
//        System.out.println("the value = " +  dataValue.substring(0, 10));

        // Loop-Common --> CustomOffsetDateTimeDeserializer
        // value from the CSV can be parsed in the format "2022-05-11T00:30:00.000000+02:00" but not "2022-05-11 00:30:00.000000 +02:00"
//        OffsetDateTime date = OffsetDateTime.of(LocalDateTime.parse("2022-05-11T00:30:00.000000+02:00",
//                DateTimeFormatter.ISO_DATE_TIME), ZoneOffset.UTC);
//        logger.info("printing the date");
//        logger.info(String.valueOf(date));






    }

}
