package com.student;

public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        if(s.length()>0){
            String subStringOfS[] = s.split(" ");
            System.out.println(subStringOfS[subStringOfS.length-1]);
            return subStringOfS[subStringOfS.length-1].length();}
        else return 0;
    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
