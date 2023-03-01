import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits){
        List<String> ans = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return ans;
        }

        String[] letterMap = {"abc","def","ghi","jkl","mon","pqrs","tuv","wxyz"};
        backtrack(ans, new StringBuilder(), digits,letterMap, 0);
        return ans;
    }


    public static void backtrack(List<String> res , StringBuilder sb , String digits,String[] letterMap,int idx) {
        if(idx == digits.length()){
            res.add(sb.toString());
            return;
        }

        int number = digits.charAt(idx) - '0' ;
        String numStr = letterMap[number - 2];
        for(int i = 0 ; i < numStr.length() ; i++){
            sb.append(numStr.charAt(i));
            backtrack(res, sb, digits, letterMap, idx + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

// @lc code=end

