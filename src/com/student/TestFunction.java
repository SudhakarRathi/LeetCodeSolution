package com.student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestFunction {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Amazon",3);
        map.put("on",3);
        map.put("zon",3);
        map.put("Amazon",7);

//        map.entrySet().stream().forEach(x-> System.out.println(x.getKey() +"   "+x.getValue()));
        System.out.println(map.size());

        List<Integer> list = Arrays.asList(1,1,3,4,5,6,7,8,9,10);

        int sumout= list.stream().filter(x->x%2==0).mapToInt(x->x*x).sum();
        System.out.println(sumout);

        double average =list.stream().mapToDouble(x->x).skip(1).average().orElse(0);
        System.out.println("average:: "+average);

        Map<Integer, Long> mapResult = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("map result "+ mapResult);

    }
}
