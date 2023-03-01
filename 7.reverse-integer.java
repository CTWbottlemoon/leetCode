/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int result = 0;
        String xString = String.valueOf(x);
        StringBuilder dest = new StringBuilder();
		for (int i = (xString.length() - 1); i >= 0; i--){
			dest.append(xString.charAt(i));
		}
		
		String resultString = dest.toString().replace("-", "");
        try{
            result = Integer.parseInt(resultString);
        }catch (NumberFormatException e){
            return 0;
        }
		if(x<0) {
			result = -1*result;
		}
		
        return result;
    }
}
// @lc code=end

