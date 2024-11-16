package com.array;
//2744. Find Maximum Number of String Pairs
public class MaxStringPairs
{
    public static String reverse(String s){
        String ans = "";
        for(int i = s.length()-1; i>=0; i--){
            ans = ans+ s.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {

        String[] words = {"ab","ba","cc", "cc"};
        int pairs = 0;

        for(int i = 0; i<words.length; i++){
            String a = words[i];
            for(int j = i+1; j<words.length; j++){
                String b = words[j];

                String revb = reverse(b);
                if (revb.equals(a)){
                    pairs++;
                }
            }
        }

        System.out.println(pairs);

    }
}
