package com.student;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int initateValue=0,endvalue=nums.length;
        int findMidVal=nums[endvalue/2];
        if(findMidVal>target){
            endvalue=(endvalue/2)+1;
        }
        else{
            initateValue=endvalue/2;
        }
        for (int i=initateValue;i<endvalue;i++){
            if(nums[i]==target){
                return i;
            }
            else if (nums[i]>target){
                return i;
            }
        }
        return endvalue;
    }
    public static void main(String[] args) {
        SearchInsertPosition s = new SearchInsertPosition();
        int [] value = new int[]{1,2,3,4,5,6};
        System.out.println(s.searchInsert(value,3));
    }
}
