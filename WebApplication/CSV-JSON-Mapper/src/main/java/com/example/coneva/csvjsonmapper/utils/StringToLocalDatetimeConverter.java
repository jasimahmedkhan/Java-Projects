package com.example.coneva.csvjsonmapper.utils;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.time.OffsetDateTime;

public class StringToLocalDatetimeConverter extends StdConverter<String, OffsetDateTime> {

    @Override
    public OffsetDateTime convert(String s) {
        return OffsetDateTime.parse(s, OffsetDateTimeToStringConverter.DATE_TIME_FORMATTER);
    }
}