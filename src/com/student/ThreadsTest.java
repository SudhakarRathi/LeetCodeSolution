package com.student;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ThreadsTest  extends Thread{


    public void run() {
        System.out.println("In run");
        yield();
        System.out.println("Leaving run");
    }

    public static void main(String[] args) {
//        (new ThreadsTest()).start();
//        int x = 0;
//        assert (x > 0) : "assertion failed"; /* Line 6 */
//        System.out.println("finished");

        String [][] argCopy = new String[2][2];
        int x;
        argCopy[0] = new String[]{"1", "2", "3"};
        x = argCopy[0].length;
        for (int y = 0; y < x; y++)
        {
            System.out.println(" " + argCopy[0][y]);
        }

        String currentday = LocalDate.now().getDayOfWeek().toString();
        System.out.println(currentday);
    }
}
