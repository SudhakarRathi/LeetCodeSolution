package com.student;

import java.util.*;
import java.util.stream.Collectors;

public class MovieFilter {
    private static Map<String, String> SP_SHOW_MAP = Map.of(
//            "Women Special","WOW",
            "Senior Citizen","SC",
            "NO Intermission Show","UN",
//			"English Subtitle","ES",
            "Regional Subtitle","RT",
            "English Subtitle","RST"
    );

    private static Map<String, Integer> SP_SHOW_COUNT = Map.of(
//            "Women Special","WOW",
            "Senior Citizen",2,
            "NO Intermission Show",3,
//			"English Subtitle",4,
            "Regional Subtitle",5,
            "English Subtitle",6
    );

    public static void main(String[] args) {
        List<String> spShows = List.of("English Subtitle","Regional Subtitle","Women Special");
        List<String> spTag = new ArrayList<>();
        spTag = spShows.stream().filter(SP_SHOW_MAP::containsKey).map(SP_SHOW_MAP::get).collect(Collectors.toList());
//        spTag.forEach(System.out::println);

        List<String> sortedLanCount =
                SP_SHOW_COUNT.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                        .map(Map.Entry::getKey).collect(Collectors.toList());

                //sorted(Map.Entry.comparingByValue()).collect(Collectors.toSet());

        sortedLanCount.forEach(System.out::println);
    }
}
