package com.example.coneva.csvjsonmapper.utils;

import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvConstraintViolationException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeConverter extends AbstractBeanField {

    private Logger logger = LoggerFactory.getLogger(ZoneDateTimeConverter.class);

    @Override
    protected Object convert(String strDate){

//        logger.info("before modification = " + strDate);

        String valueWithNoSpaces = strDate.replaceAll("\\s+", "");
        String dateString = valueWithNoSpaces.substring(0, 10) + "T" + valueWithNoSpaces.substring(10);

//        logger.info("after modification = " + dateString);

        // input to the OffsetDateTime parser ----> output is OffsetDateTime
        // 2022-05-10T22:45:00.000000+00:00

        OffsetDateTime date = OffsetDateTime.from(ZonedDateTime.parse(dateString, DateTimeFormatter.ISO_OFFSET_DATE_TIME)
                .toInstant()
                .atOffset(ZoneOffset.UTC));

        // with a defined pattern
//        OffsetDateTime date = OffsetDateTime.from(ZonedDateTime.parse(dateString,
//                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSZZZZZ")));

//        //  You have to use one pattern for parsing and another for formatting.
//        String date = String.valueOf(Instant.parse(dateString)
//                .atOffset(ZoneOffset.UTC)
//                .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));

//        logger.info("printing the date");
//        logger.info(String.valueOf(date));

        return date;

    }
}
