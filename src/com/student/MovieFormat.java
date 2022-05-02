package com.student;

import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

public class MovieFormat {
    public static void main(String[] args) {
        /*String movieFormat = "PLAYHOUSE,REGULAR,GOLD,DIT,DC,OPULENT,4DX,IMAX,PXL,ONYX,SAPPHIRE,LUXE,DRIVEIN,LOFT,ABCD";
        List<String> movieformatList = Arrays.asList(movieFormat.split(","));
        Set<String> movieformatfound = Set.of(
                "PLAYHOUSE",
                "4DX",
                "IMAX",
                "DIT"
        );

        System.out.println(movieformatList);
        System.out.println("GAPE");
        System.out.println(movieformatfound);
        System.out.println("GAPE");
        List<String> movieformatListnew = movieformatList.stream().filter(movieformatfound::contains).collect(Collectors.toList());

        System.out.println(movieformatListnew);*/

        List<String> cinemaFormatNew = new ArrayList<>();
        cinemaFormatNew.add("IMAX");
        Map<String, String> SP_SHOW_MAP = Map.of(
                "IMAX","image url 1",
                "IMAX2","image url 2"
        );
           Map<String,String> result = SP_SHOW_MAP.entrySet().stream()
                    .filter(x-> cinemaFormatNew.contains(x.getKey()))
                    .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        System.out.println(result);
        System.out.println(SP_SHOW_MAP);
    }
}
