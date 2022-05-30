package com.student;

public class ReverseIntegerMadium {
    public static void main(String[] args) {
        int i = 1534236469;
        /*String si = String.valueOf(i);
        System.out.println(si);
        String sb = "";
        for (int a= si.length()-1;a>=0;a--){
            sb+=(si.charAt(a));
        }
        System.out.println(Integer.parseInt(sb));*/
        long reverse = 0;
        while (i!=0){
            reverse = reverse * 10 + i%10;
            i = i/10;

        }


        if(reverse> Math.pow(2,31)-1 || reverse < -1 * Math.pow(2,31))
            System.out.println(0);

        System.out.println(reverse);
    }
}
