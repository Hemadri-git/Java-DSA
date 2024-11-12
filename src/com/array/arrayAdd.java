package com.array;

public class arrayAdd
{
    public static int[] add(){
        int arr[] = {1,3,4,5,6};
        return arr;
    }
    public static void main(String[] args) {
        int []a = add();
        int sum = 0;

        for (int i = 0; i<a.length; i++){
            sum += a[i];
        }

        System.out.println("Total sum : " + sum);
    }
}
