package com.example.coneva.csvjsonmapper.utils;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeToStringConverter extends StdConverter<OffsetDateTime, String> {

    static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    @Override
    public String convert(OffsetDateTime offsetDateTime) {
        return offsetDateTime.format(DATE_TIME_FORMATTER);
    }
}
