package com.student;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSum = -1000;
        int sum = 0;

        for(int i: nums){
            sum = sum + i;
            maxSum = Math.max(sum,maxSum);
//            if(sum < 0) sum = 0;
            sum=sum<0?0:0;
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
