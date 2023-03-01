
/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
		int result = 0;
        char[] charArray1 = s.toCharArray();
        StringBuilder stb = new StringBuilder("");
        for(char a: charArray1){
            int ascii = (int) a;
            if(ascii<48 || ascii >57){
            	if(ascii != 45 && ascii != 32 && ascii != 43){
            		break;
            	}
            	if(stb.length() != 0) {
            		break;
            	}
            }
            if(ascii>=48 && ascii<= 57 || ascii==45 || ascii ==43){
                stb.append(a);
            }
        }

        String resultString = stb.toString();

        try{
            result = Integer.parseInt(resultString);
        }catch (NumberFormatException e){
            try {
                if(Double.parseDouble(resultString)>2147483647){
                    return 2147483647;
                }else if(Double.parseDouble(resultString)<-2147483648){
                    return-2147483648;
                }
            } catch (Exception e2) {
                return 0; 
            }
           
            
        }

        return result;
    }
}
// @lc code=end

