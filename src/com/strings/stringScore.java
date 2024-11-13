
/*
leetcode: 3110
You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

Return the score of s.*/

package com.strings;
public class stringScore
{
    public static void main(String[] args) {

        String name  = "hello";
        int res = 0;

        for(int i = 0; i < name.length()-1; i++){
            int i1 = i;
            int i2 = i + 1;

            char fc = name.charAt(i1);
            char sc = name.charAt(i2);

            int diff = Math.abs(fc - sc );
            res += diff;

        }

        System.out.println(res);
    }
}
