package com.array;

public class onesIsInArr
{
    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 5, 32, 1, 43, 1, 34, 66, 1, 23, 1};
        int count = 0;

        for (int i = 0; i< nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
        }
        System.out.println("one in array count: "+ count);
    }
}
