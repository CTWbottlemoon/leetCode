import java.util.Arrays;

/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int tempSum = 0;
        int sum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 2 ; i++){
            int left = i+1;
            int right = nums.length - 1;
           
            while(left<right){
                tempSum = nums[i]+nums[left]+nums[right];
                if(tempSum == target){
                    return tempSum;
                }
                else if(Math.abs(target-tempSum) < Math.abs(target-sum) ){
                    sum = tempSum;
                }

                if(tempSum < target){
                    left++;
                    while(nums[left] == nums[left-1] && left < right){
                        left++;
                    }
                }else{
                    right--;
                }
                

            }
        }

        return sum;
    }
}
// @lc code=end

