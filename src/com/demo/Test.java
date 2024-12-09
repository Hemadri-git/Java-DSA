package com.demo;


class Test {

    public static void main(String[] args) {

        int[] num = {1,22,3,21,3,42,2};
        int n = num.length;

        for (int i =0; i<n-1; i++){
            boolean swap = false;
            for (int j = 0; j< n-i-1; j++){
                if (num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] =temp;
                    swap = true;
                }
            }
            if (!swap){
                break;

            }
        }

        for (int i =0; i<n; i++){
            System.out.print(num[i]+ " ");
        }

    }
}