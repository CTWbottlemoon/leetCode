/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {


        String xString = String.valueOf(x);
        String xReverse = new StringBuilder(xString).reverse().toString();
        
        if (xString.equals(xReverse)){
            return true;
        }

        return false;




        
    }
}
// @lc code=end

