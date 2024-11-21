package com.demo;

public class Test
{
    public static void main(String[] args) {

        int n = 6;

       for (int i = 0; i<n; i++){
           for (int j = 0; j<2*(n-i-1); j++){
               System.out.print(" ");
           }
           for (int k = i+1; k>=1; k--){
               System.out.print(k+" ");
           }
           for(int l = 2; l<=i+1; l++){
               System.out.print(l + " ");
           }
           System.out.println();
       }






    }
}