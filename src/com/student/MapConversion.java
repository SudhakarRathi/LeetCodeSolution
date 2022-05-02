package com.student;

import java.util.*;
import java.util.stream.Collectors;

public class MapConversion {

    static Map<String, Set<String>> convert(Map<String, List<String>> map1){

       return map1.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,e->new HashSet(e.getValue())));

//        return map1.entrySet().stream()
//                .collect(Collectors.toMap(Map.Entry::getKey, e -> new HashSet<>(e.getValue())));
    }

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList(new String[]{"a","b"});
        Map<String, List<String>> map1 = new HashMap<>(){{
            put("strin1", Arrays.asList(new String[]{"a","a"}));
            put("strin2", Arrays.asList(new String[]{"d","d"}));
            put("strin3", Arrays.asList(new String[]{"e","f"}));
        }};

        System.out.println( convert(map1));

    }
}
