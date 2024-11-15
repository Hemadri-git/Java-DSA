package com.strings;
// Leetcode - 771. Jewels and Stones
public class jewelsStones
{
    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";
        int count = 0;

        for(int i = 0; i<jewels.length(); i++){
            char n = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++){
                char m = stones.charAt(j);
                if (n == m){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
