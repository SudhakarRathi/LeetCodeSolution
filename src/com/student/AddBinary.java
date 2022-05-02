package com.student;

import java.util.Arrays;

public class AddBinary {

    public static void main(String[] args) {
        String a="100";
        String b= "1";
        System.out.println( addBinary(a,b));

    }

    public static String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0) sum += a.charAt(i)-'0';

            if(j>=0) sum += b.charAt(j)-'0';

            sb.append(sum%2);
            carry = sum/2;

            i--;
            j--;
        }
        if(carry!=0) sb.append(carry);
        return sb.reverse().toString();

        /*String [] aOfa = a.split("");
        String [] bOfb = b.split("");

        int length = aOfa.length>bOfb.length? aOfa.length : bOfb.length;

        String [] result = new String[length+1];
        boolean carry = false;
        for (int i=0;i<length;i++){
            String firstElement ="0";
            String secondElement ="0";
            String digit = "0";
            try{
                 firstElement = aOfa[aOfa.length-1-i];
            }catch (ArrayIndexOutOfBoundsException e){

            }
            try{
                 secondElement = bOfb[bOfb.length-1-i];
            }catch (ArrayIndexOutOfBoundsException e){

            }
            if(firstElement.equals("1") && secondElement.equals("1")&& !carry){
                digit = "0";
                carry = true;
            }
            else if (firstElement.equals("1") && secondElement.equals("1")&& carry){
                digit = "1";
                carry = true;
            }
            else if(firstElement.equals("1") && secondElement.equals("0")&& !carry){
                digit = "1";
                carry = false;
            }
            else if(firstElement.equals("1") && secondElement.equals("0")&& carry){
                digit = "0";
                carry = true;
            }else if(firstElement.equals("0") && secondElement.equals("1")&& !carry){
                digit = "1";
                carry = false;
            }
            else if(firstElement.equals("0") && secondElement.equals("1")&& carry){
                digit = "0";
                carry = true;
            }
            else if(firstElement.equals("0") && secondElement.equals("0")&& !carry){
                digit = "0";
                carry = false;
            }
            else if(firstElement.equals("0") && secondElement.equals("0")&& carry){
                digit = "1";
                carry = false;
            }

            result[result.length-1-i]=digit;

        }

        if(carry){
            result[0]="1";
        }
        StringBuffer stb = new StringBuffer();
        for (String r : result){
            if(r!=null)
                stb.append(r);
        }

        System.out.println(stb.toString());

        return stb.toString();*/
    }
}
