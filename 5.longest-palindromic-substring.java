import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int sLength = s.length();
        int sLastCharIndex = sLength - 1;
        String result;
        List<String> resultList = new ArrayList<String>();

        for(int i = 0 ; i < sLength ; i++){
            for(int j=sLastCharIndex ; j >= i ; j--){
                if(s.charAt(i)==s.charAt(j)){
                    String s2 = s.substring(i, j+1);
                    StringBuilder strb = new StringBuilder(s2);
                    String s2Re = strb.reverse().toString();
                    if(s2.equalsIgnoreCase(s2Re)){
                        resultList.add(s2);
                    }
                }
                if(!resultList.isEmpty()){
                    if(resultList.get(0).length()==sLength){
                        break;
                    }
                }
            }
            if(!resultList.isEmpty()){
                if(resultList.get(0).length()==sLength){
                    break;
                }
            }
        }
        int maxStringIndex = 0;
        for(int i = maxStringIndex ; i < resultList.size() ; i++) {
        	String maxString = resultList.get(maxStringIndex);
        	String tempString = resultList.get(i);
        	if(tempString.length() > maxString.length()) {
        		maxStringIndex = i;
        	}
        }
        
        result =resultList.get(maxStringIndex);




        return result;
    }
}
// @lc code=end

