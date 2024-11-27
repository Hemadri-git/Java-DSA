package com.array;

public class maxProfit
{
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6};
        int n = arr.length;
        int low = arr[0];
        int profit = 0;

        for (int i = 1; i<n; i++){
            int temp = arr[i] - low;
            profit = Math.max(profit, temp);

            if (arr[i] < low ){
                low = arr[i];
            }
        }
        System.out.println(profit);
    }
}
