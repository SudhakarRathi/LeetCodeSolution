package com.student;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Latest5TopRecordsInCache {
    static List<String> list1  = List.of("A","B","C","A","A","D","E","B","F","G","H","I","J","A");
    static Map<String,Integer> map1 = new HashMap<>();
    public static void main(String[] args) {


        list1.forEach(a->{
            System.out.println("Entry found "+a);
            Integer temp =1;
           if(map1.size()<5 || map1.containsKey(a)){
               if(map1.containsKey(a)){
                   temp = map1.get(a);
                   temp++;
               }
           } else{
//               remove from map
//               removeFromMap(a);
               Map.Entry<String, Integer> test = map1.entrySet().stream().min((x, y) -> Integer.compare(x.getValue(), y.getValue())).get();
               System.out.println("test found for remove "+test);
               map1.remove(test.getKey());
           }
            map1.put(a,temp);
            System.out.println("result "+ map1);
        });


    }

    private static void removeFromMap(String a) {
        Map.Entry<String, Integer> test = map1.entrySet().stream().min((x, y) -> Integer.compare(x.getValue(), y.getValue())).get();
        System.out.println("test found "+test);
        map1.remove(test.getKey());
    }

//    Calendar calender = Calendar.getInstance();

}
