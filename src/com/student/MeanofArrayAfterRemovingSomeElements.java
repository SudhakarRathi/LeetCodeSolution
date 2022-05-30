package com.student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MeanofArrayAfterRemovingSomeElements {

    public static void main(String[] args) {

        int [] arr =  {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
        System.out.println(trimMean(arr));
    }
    public static double trimMean(int[] arr) {
        /*int removeCount = (int)(arr.length *.05);
//        System.out.print(removeCount);
        List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());
*/
        int removeCount = (int) (arr.length*.05);
        System.out.println(removeCount);
        Arrays.sort(arr);
        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        double sum=0;
        double count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[0]!=arr[i] && arr[arr.length-1]!=arr[i] && 1!=arr[i] && 9!=arr[i]){
            count++;
            sum+=arr[i];
            }
        }

        double value = sum / count;
        return value;
    }
}
