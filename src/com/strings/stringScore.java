
/*
leetcode: 3110
You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

Return the score of s.*/

package com.strings;
public class stringScore
{
    public static void main(String[] args) {

        String s = "hello";
        int ans = 0;

        for(int i = 0; i<s.length()-1; i++)
        {
            int first = s.charAt(i);
            int second = s.charAt(i+1);
            int adj = first - second;
            int abs = Math.abs(adj);
            ans = ans + abs;
        }

        System.out.println(ans);
    }
}
