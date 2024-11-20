package com.patterns;

public class pyramidNum
{
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i<n; i++){
            for (int j = 0; j< n-i-1; j++){
                System.out.print("  ");
            }
            for (int k = i; k>=0; k--){
                System.out.print(k+1 + " ");
            }
            for (int j = 2; j<=i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
