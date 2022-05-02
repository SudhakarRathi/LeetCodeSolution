package com.student;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int [] temp = nums;
       int tempValue = 0,unique=0;
       for(int i=0;i<temp.length;i++){
           if(i==0){
               tempValue=temp[i];
               nums[i]=tempValue;
               unique++;
           }else{
               if(tempValue==temp[i]){
                   tempValue=temp[i];

               }
               else{
                   tempValue=temp[i];
                   nums[i]=tempValue;
                   unique++;
               }
           }
       }
       return unique;

     /*   int i =0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;*/
    }
    public static void main(String[] args) {
        int [] nums = new int[]{1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
