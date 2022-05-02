package com.student;

import java.util.List;
import java.util.stream.IntStream;

public class FindVowlesAndConsonants {
    public static void main(String[] args) {
        String vowles = "aeiou";
        String givenValue="HellO".toLowerCase().trim();
        int vowelCount=0,consonantCount=0;
        for(int i =0; i<givenValue.length();i++){
            if(vowles.contains(""+givenValue.charAt(i))){

                vowelCount++;
            }else{
                consonantCount++;
            }
        }
        System.out.println(vowelCount+"--"+consonantCount);
        
    }
}
