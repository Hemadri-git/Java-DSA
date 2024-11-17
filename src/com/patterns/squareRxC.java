package com.patterns;

public class squareRxC
{
    public static void main(String[] args) {
        int r = 3;
        int c = 9;

        for(int i = 0; i<r; i++){
            for (int j = 0; j<c; j++){
                System.out.print("*");
                if (j != c-1)
                    System.out.print(" ");
            }
            System.out.println();
        }


    }
}
