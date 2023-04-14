package com.example.demo.entity;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {

    private static final DateTimeFormatter ISO_DATE_TIME_FORMAT = DateTimeFormatter.ISO_DATE_TIME;

    @Override
    public LocalDateTime deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        String dateString = parser.readValueAs(String.class);
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString, ISO_DATE_TIME_FORMAT);
        return offsetDateTime.toLocalDateTime();
    }

}
