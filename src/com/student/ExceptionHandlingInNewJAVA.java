package com.student;

import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingInNewJAVA {

    public static void main(String[] args) {

        List<String> list1 = List.of("1","2","qwe","4");

        list1.forEach(ExceptionHandlingInNewJAVA::printExc);

    }

    public static void printExc(String s){
        try {
            System.out.println(Integer.parseInt(s));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
