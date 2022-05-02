package com.student;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CharFrequencyCheck {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis()+"-1");
        char[] arr = {'a', 'a', 'c', 'd', 'd', 'd', 'd'};
        Map<Character, Long> result = IntStream.range(0, arr.length).mapToObj(i -> arr[i])
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
        System.out.println(System.currentTimeMillis()+"-2");
        Stream<Character> charArray = Stream.of('a', 'a', 'c', 'd', 'd', 'd', 'd');
        Map<Character, Long> result1 = charArray.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result1);
        System.out.println(System.currentTimeMillis()+"-3");

        var listOfString = List.of("SUDHAKARRATHI".split(""));
        Map<String, Long> result3 = listOfString.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<String, Long> result4 = new ConcurrentHashMap<>();

        result4.putAll(result3);
        System.out.println(result3);
        System.out.println(result4);
    }
}
