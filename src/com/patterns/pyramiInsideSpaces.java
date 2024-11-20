package com.patterns;

public class pyramiInsideSpaces
{
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i<n; i++){
            for (int j = 0; j < n- i -1; j++){
                System.out.print(" ");
            }
            for (int k = 0; k<2*i+1; k++){
                if (i == n-1 || k == 0 || k == 2*i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
