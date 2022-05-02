package com.student;

import java.util.LinkedList;
import java.util.List;

public class AvarageOfList {

    public static void main(String[] args) {

        List<Integer> listOfInt = List.of(1,2,3,4,5,6,7,8,11,10);

        System.out.println("Average"+listOfInt.stream().mapToDouble(v->v).average().orElse(0.0));

        System.out.println("Max "+listOfInt.stream().mapToInt(v->v).max().getAsInt());

        System.out.println("Min "+listOfInt.stream().mapToInt(v->v).min().orElse(0));

        System.out.println("second higest value "+listOfInt.stream().sorted((a,b)->b.compareTo(a)).skip(2).findFirst().get());
    }
}
