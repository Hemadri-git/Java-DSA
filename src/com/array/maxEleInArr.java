package com.array;

public class maxEleInArr
{
    public static void main(String[] args) {
        int arr[] = {23,2,4534,665,3,63,1};

        // method - 1:
//        int ans = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(ans<arr[i]){
//                ans = arr[i];
//            }
//        }
//
//        System.out.println(ans);

        //method 2:
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            ans = Math.max(ans , arr[i]);
        }
        System.out.println(ans);

    }
}
