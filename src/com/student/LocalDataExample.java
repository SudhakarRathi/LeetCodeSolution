package com.student;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDataExample {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.of(1993,07,28,7,25);
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String text = date.format(formatters);
        LocalDate parsedDate = LocalDate.parse(text, formatters);

        System.out.println(dateTime.getMonth());

        System.out.println("date: " + date);
        System.out.println("Text format " + text);
        System.out.println("parsedDate: " + parsedDate.format(formatters));
    }
}
