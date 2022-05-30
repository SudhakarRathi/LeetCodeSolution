package com.student;

import java.util.*;

public class LongestStringWithoutRepeatingCharacterMedium {

    public static void main(String[] args) {

        String s = "abcabcde";
         Map<Character, Integer> mp =new HashMap<>();
        int max = 0;
        int left = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(mp.containsKey(ch) && left<= mp.get(ch)){
                left = mp.get(ch)+1;
            }
            max = Math.max(max, i-left+1);
            mp.put(ch, i);
        }
        System.out.println(max);




        /*   String [] sArr = s.split("");
        String temp = "";
//        boolean continuty = true;
        String longStr = "";
        for (String a: sArr) {
            if(!temp.contains(a)){
                temp+=a;
//                continuty = true;
            }else{
//                continuty = false;
                longStr= longStr.length()>temp.length()?longStr:temp;
                temp=temp.substring(1);
                temp+=a;
            }
        }
      //  longStr= longStr.length()>temp.length()?longStr:temp;
        System.out.println(longStr);*/
    }
}
