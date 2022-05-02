package com.student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileForLineCount {
    public static void main(String[] args) {
        long lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("fileName"))) {
            while (reader.readLine() != null) {
                lines++;
//                new file creation and save
            };
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("line "+lines);
    }
}
