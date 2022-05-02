package com.student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonCheck {
    public static void main(String[] args) throws ParseException {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss z yyyy");
        System.out.println("DateTimeFormatter "+LocalDate.from(df.parse("Tue Nov 09 18:04:07 WAT 2021")).getDayOfMonth());

        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
//        System.out.println("SimpleDateFormat "+LocalDate.from(sdf.parse("Tue Nov 09 18:04:07 WAT 2021")).getDayOfMonth());

       /* List<String> listodString = Arrays.asList(new String[]{"a","b","c"});
        listodString.remove(0);*/
        Stream<String> streamObj = Stream.of("a","b","c");
        List<String> list1 = streamObj.collect(Collectors.toList());
        list1.isEmpty();
        list1.remove(0);
    }
}
