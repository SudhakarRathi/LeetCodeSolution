package com.student;

import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingInNewJAVA {

    public static void main(String[] args) {

        List<String> list1 = List.of("1","2","qwe","4");

//        list1.forEach(ExceptionHandlingInNewJAVA::printExc);
//        list1.forEach(exceptionHandleIfAny(s-> System.out.println(Integer.parseInt(s))));
        long i = 100;
        String a = ""+ (100/10);
        System.out.println("s = "+a);
    }

    public static void printExc(String s){
        try {
            System.out.println(Integer.parseInt(s));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static Consumer<String> exceptionHandleIfAny(Consumer<String> obj){
        return obj2 ->{
            try{
                obj.accept(obj2);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        };
    }
}
