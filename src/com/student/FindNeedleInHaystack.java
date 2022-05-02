package com.student;

import java.util.Optional;

public class FindNeedleInHaystack {
    public static int strStr(String haystack, String needle) {
        if (!haystack.isBlank() && !needle.isBlank()){
            return haystack.contains(needle) ? haystack.indexOf(needle) : -1;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }
}
