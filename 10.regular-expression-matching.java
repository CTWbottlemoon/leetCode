/*
 * @lc app=leetcode id=10 lang=java
 *
 * [10] Regular Expression Matching
 */

// @lc code=start
class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[s.length()][p.length()] = true;

        for(int i = s.length() ; i >= 0 ; i--){
            for(int j = p.length() - 1 ; j>= 0 ; j--){
                boolean first_match = (i < s.length() && p.charAt(j) == s.charAt(i) || p.charAt(j) == '.');
                if(j + 1 < p.length() && p.charAt(j+1) == '*'){
                    dp[i][j] = dp[i][j+2] || first_match && dp[i+1][j] ;
                }else{
                    dp[i][j] = first_match && dp[i+1][j+1];
                }

            }


        }



        return dp[0][0];
    }
}
// @lc code=end

