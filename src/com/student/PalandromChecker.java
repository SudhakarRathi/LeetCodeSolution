package com.student;

import java.util.stream.IntStream;

public class PalandromChecker {
    public static void main(String[] args) {
        String palan = "madabdam";
        for (int i = 0; i< palan.length()/2 ; i++) {
            if(palan.charAt(i)==palan.charAt(palan.length()-(i+1)))
                System.out.println(true);
            else
                System.out.println(false);
        }

        IntStream.range(0,palan.length()/2)
                .allMatch(i->palan.charAt(i)==palan.charAt(palan.length()-(i+1)));
    }
}
