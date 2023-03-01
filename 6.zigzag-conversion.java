/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if( s==null || numRows <= 1 || s.length()==0 ){
            return s;
        }
        
        String result = "";
        StringBuilder strb = new StringBuilder();
        int spaceConut = 2*numRows - 2;
        for(int i = 0 ; i < numRows ; i++){
            
            for(int j = i ; j<s.length(); j+=spaceConut){
                strb.append(s.charAt(j));
                if(i>0&&i<numRows-1) {
                	int mid = j + spaceConut - 2*i;
                	if(mid<s.length()) {
                		strb.append(s.charAt(mid));
                	}
                }

            }
        }
    
        result = strb.toString();
    
    
        return result;
    }




}
// @lc code=end

