package com.patterns;

public class revPyramid
{
    public static void main(String[] args) {
        int n = 4;

        for(int i = n; i>0; i--){
            for (int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k<2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
