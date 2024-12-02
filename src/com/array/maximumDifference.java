package com.array;

public class maximumDifference
{
    public static void main(String[] args) {
        int nums[] = {7, 1, 5, 4};
        int diff = -1;
        int min = nums[0];

        for(int i = 1; i<nums.length; i++){
            int val = nums[i];
            if(min < val){
                int temp = val - min;
                diff = Math.max(temp, diff);
            }
            else{
                min = Math.min(val, min);
            }
        }
        System.out.println(diff);;
    }
}
