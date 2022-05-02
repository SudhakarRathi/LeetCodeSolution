package com.student;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PlusOneInArray {
    public static void main(String[] args) {
        int[] digits = new int[]
                {9};
//                {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
//        int[] result = new int[degits.length+2];
       /* int shift = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int newDigit = digits[i] + shift;
            digits[i] = newDigit % 10;
            shift = newDigit / 10;
        }

        if (shift > 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = shift;
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i] = digits[i - 1];
            }

            System.out.println(newDigits);
        }

        System.out.println(digits);*/

        int shift = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int newDigit = digits[i]+shift;
            digits[i]= newDigit % 10;
            shift = newDigit / 10;
        }




       /* for (int i = degits.length-1; i >= 0; i--) {
            System.out.println(degits[i]);
        }

        StringBuilder sb = null;
        sb = new StringBuilder();
        for (int a:degits
             ) {
            sb.append(a);
        }
        System.out.println(sb.toString());
        BigInteger ii = new BigInteger(sb.toString());
        BigInteger iii = new BigInteger("1");
        BigInteger i = ii.add(iii);
        System.out.println(i);
        sb = new StringBuilder();
        sb.append(i);
        String makeArray[] = sb.toString().split("");
        int[] result = new int[makeArray.length];
        for (int ia=0; ia<makeArray.length;ia++){
            System.out.println(makeArray[ia]);
            result[ia]= Integer.parseInt(makeArray[ia]);
            System.out.println(result[ia]);
        }*/

       /* String showTime = "Oct 9 2021 06:20:00:000PM";

        final Calendar date2 = Calendar.getInstance();
        date2.setTime(new Date());
        date2.add(Calendar.DAY_OF_YEAR, 1);

        final Calendar date3 = Calendar.getInstance();
        date3.setTime(new Date());
        date3.add(Calendar.DAY_OF_YEAR, 3);

        long a = date3.getTime().getTime() -date2.getTime().getTime();

        TimeUnit.MILLISECONDS.toHours(date3.getTime().getTime() - date2.getTime().getTime());
        System.out.println("Hrs : "+TimeUnit.MILLISECONDS.toHours(date3.getTime().getTime() - date2.getTime().getTime()));
        final DateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        String validity = sdf.format(date2.getTime());

        System.out.println(validity);*/

    }
}
