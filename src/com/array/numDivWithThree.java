package com.array;

public class numDivWithThree
{
    public static void main(String[] args) {
        int nums[] = {  0,1,0, 3, 2, 3, 1, 45, 1, 48,0};
        int count = 0;

        for(int i = 0; i<nums.length; i++){

            if(nums[i]%3 == 0 && nums[i] !=0 ){
                count++;
            }
        }

        System.out.println(count);
    }
}
