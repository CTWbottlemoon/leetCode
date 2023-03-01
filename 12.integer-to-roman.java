/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start
class Solution {
    public String intToRoman(int num) {
        StringBuilder strb = new StringBuilder("");        
        for(int i = 1 ; i<=num / 1000 ;i++){
            strb.append("M");
        }
        num %= 1000;
        for(int i = 1 ; i<=num / 900 ;i++){
            strb.append("CM");
        }
        num %= 900;
        for(int i = 1 ; i<=num / 500 ;i++){
            strb.append("D");
        }
        num %= 500;
        for(int i = 1 ; i<=num / 400 ;i++){
            strb.append("CD");
        }
        num %= 400;
        for(int i = 1 ; i<=num / 100 ;i++){
            strb.append("C");
        }
        num %= 100;
        for(int i = 1 ; i<=num / 90 ;i++){
            strb.append("XC");
        }
        num %= 90;
        for(int i = 1 ; i<=num / 50 ;i++){
            strb.append("L");
        }
        num %= 50;
        for(int i = 1 ; i<=num / 40 ;i++){
            strb.append("XL");
        }
        num %= 40;
        for(int i = 1 ; i<=num / 10 ;i++){
            strb.append("X");
        }
        num %= 10;
        for(int i = 1 ; i<=num / 9 ;i++){
            strb.append("IX");
        }
        num %= 9;
        for(int i = 1 ; i<=num / 5 ;i++){
            strb.append("V");
        }
        num %= 5;
        for(int i = 1 ; i<=num / 4 ;i++){
            strb.append("IV");
        }
        num %= 4;
        for(int i = 1 ; i<=num / 1 ;i++){
            strb.append("I");
        }
        


        return strb.toString();
    }



}
// @lc code=end

