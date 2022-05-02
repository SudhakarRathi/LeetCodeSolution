package com.student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingListExample {

    public static void main(String[] args) {
        Stream<Integer> streamObj = Stream.of(34, 12, 7, 43, 55, 97, 41, 28, 2, 62);
        List<Integer> list1 = streamObj.collect(Collectors.toList());
        int middleIndex = list1.size()/2;
        System.out.println(middleIndex);
        List<Integer> firstHalf = list1.subList(0,middleIndex).stream().sorted().collect(Collectors.toList());
        List<Integer> secondHalf = list1.subList(middleIndex,list1.size()).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("firstHalf"+firstHalf+"\nsecondHalf"+secondHalf);
        firstHalf.addAll(secondHalf);
        System.out.println(firstHalf);
    }
}
