package com.student;

import java.util.HashMap;
import java.util.Map;

public class AeroplaneTimeMovieProb {
    public static void main(String[] args) {
        int [] arr ={10,20,30,40,50,55,60};
        int flightTime = 70;


        Map<Integer,Integer> timings = new HashMap<>();
        for (int a=0;a<arr.length;a++) {
            if (timings.containsKey(flightTime-arr[a])){
                System.out.println("positions : "+a+" -- "+timings.get(flightTime-arr[a]));
            }else {
                timings.put(arr[a],a);
            }
        }
        int ceilvalue = (int) Math.ceil(arr.length/2);
        System.out.println(ceilvalue);
        for (int a=0 ; a<ceilvalue;a++){
            if(flightTime-arr[a]==arr[arr.length-1-a]){
                System.out.println(a+" ---- "+(arr.length-1-a));
            }
        }

    }
}
