package com.array;

public class minEleInArr
{
    public static void main(String[] args)
    {
        int arr[] = {785, 23, 34, 535, 2, 10};
        int small = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
            small = Math.min(small, arr[i]);
        }

        System.out.println(small);
    }
}
