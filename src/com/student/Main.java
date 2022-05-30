package com.student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        String cardno = "1234567890123456";
            String firstSubstring = cardno.substring(0, 6);
            String lastSubstring = cardno.substring(cardno.length()-4, cardno.length());
            int lengthOFx = cardno.length()-10;
        System.out.println(firstSubstring+"  ---  "+lastSubstring+"  length remaining "+lengthOFx);

        Map<String,String> mapObj = new TreeMap<>();
        mapObj.put("a","abc");

        System.out.println("123456789".substring(0,6));
    }
}
