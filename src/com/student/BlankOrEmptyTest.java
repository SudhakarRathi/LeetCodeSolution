package com.student;

import java.util.List;

public class BlankOrEmptyTest {
    public static void main(String[] args) {
        String test = null;
        String test2 = "";
        String test3 = " ";

        System.out.println( test!=null? test.isBlank():"NULL");
        System.out.println(test2.isBlank());
        System.out.println(test3.isBlank());

        System.out.println(test!=null? test.isEmpty():"NULL");
        System.out.println(test2.isEmpty());
        System.out.println(test3.isEmpty());

    }
}
