package com.array;
/*2011. Final Value of Variable After Performing Operations*/
public class performingOperators {
    public static void main(String[] args) {
        String s[] = {"X++", "++X", "X++", "X--"};
        int length = s.length;
        int ans = 0;

        for(int i = 0; i<length; i++){
            String temp = s[i];

            if(temp.equals("X++") || temp.equals("++X")){
                ans = ans + 1;
            }
            else {
                ans = ans - 1;
            }
        }

        System.out.println(ans);
    }
}
