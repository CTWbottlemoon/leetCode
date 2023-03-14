import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        long average = target / 4;
        if(average < nums[0] || average > nums[nums.length-1]){
            return result; 
        }
        List<Integer> tempResult =  new ArrayList<>();
        
        for(int i = 0 ; i < nums.length  ; i++){
            for(int j = i + 1 ; j< nums.length ; j++){
                int tempTarget = target - nums[i] - nums[j];
                int left = j + 1;
                int right = nums.length - 1;
                int sum = nums[left]+nums[right];
                while(right > left){
                    if(tempTarget == sum){
                        tempResult.add(nums[i]);
                        tempResult.add(nums[j]);
                        tempResult.add(nums[left]);
                        tempResult.add(nums[right]);
                        if(!result.contains(tempResult)){
                            result.add(tempResult);
                        }
                        tempResult.clear();
                        left++;
                        right--;
                    }else if(tempTarget > sum){
                        left++;
                    }else{
                        right--;
                    }

                }
                
            }
        }
        return result;
    }
}
// @lc code=end

