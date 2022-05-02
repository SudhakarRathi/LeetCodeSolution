package com.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DigitSumEarth {
    public static void main(String[] args) throws IOException {
       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String S = br.readLine();

            int out_ = solve(N, S);
            System.out.println(out_);

        }

        wr.close();
        br.close();*/
        solve(3,"123456");
    }
    static int solve(int N, String S){
        // Write your code here
        String [] sArray = S.split("");
        int sumFirstPart=0, sumSecondPart=0;
       for(int i=0;i<N;i++){
           sumFirstPart+= Integer.parseInt( sArray[i]);
           sumSecondPart+=Integer.parseInt(sArray[sArray.length-1-i]);
       }
       int difference = 0;
       if(sumFirstPart>sumSecondPart){
           difference=sumFirstPart-sumSecondPart;
       }
       else if(sumFirstPart<sumSecondPart){
           difference=sumSecondPart-sumFirstPart;
           int maxTotal = N*9;
       }

        System.out.println(difference);


        return 0;
    }
}
