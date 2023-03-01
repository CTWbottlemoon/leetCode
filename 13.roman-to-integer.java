import java.util.Arrays;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hrds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thrs = {"","M","MM","MMM"};
        for(int i = s.length() ; i>=0 ; i--) {
        	try {
        		if(Arrays.asList(thrs).contains(s.substring(0,i))) {
        			result += 1000*Arrays.asList(thrs).indexOf(s.substring(0, i));	
        			s = s.substring(i,s.length());
        		}          		      	        		
        	}catch (StringIndexOutOfBoundsException e) {
        		continue;
        	}
        	
        }
        for(int i = s.length() ; i>=0 ; i--) {
        	try {
        		if(Arrays.asList(hrds).contains(s.substring(0,i))) {
        			result += 100*Arrays.asList(hrds).indexOf(s.substring(0, i));	
        			s = s.substring(i,s.length());
        		}        	
	        		
        	}catch (StringIndexOutOfBoundsException e) {
        		continue;
        	}
        }
        for(int i = s.length() ; i>=0 ; i--) {
        	try {
	        		
        		if(Arrays.asList(tens).contains(s.substring(0,i))) {
        			result += 10*Arrays.asList(tens).indexOf(s.substring(0, i));	
        			s = s.substring(i,s.length());
        		}        	
        	}catch (StringIndexOutOfBoundsException e) {
        		continue;
        	}
        }
        for(int i = s.length() ; i>=0 ; i--) {
        	try {
        		if(Arrays.asList(ones).contains(s.substring(0,i))) {
        			result += Arrays.asList(ones).indexOf(s.substring(0, i));	
        			s = s.substring(i,s.length());
        		}        	
	        		
        	}catch (StringIndexOutOfBoundsException e) {
        		continue;
        	}
        }
        
        
        return result;
    }
}
// @lc code=end

