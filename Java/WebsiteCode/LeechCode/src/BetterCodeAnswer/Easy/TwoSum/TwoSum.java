package BetterCodeAnswer.Easy.TwoSum;

import java.util.HashMap;
import java.util.Map;
/**
 * <html>
 *     <head>
 *         <style TYPE="text/css">
 *              li {margin-bottom:2em;}
 *         </style>
 *     </head>
 *     <body>
 *           Problem: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. 
 *              <ul>    
 *                  <li> You may assume that each input would have exactly one solution, and you may not use the same element twice. 
 *                  <li> You can return the answer in any order.
 *              </ul> 
 *     </body>
 * </html>
 */
class Solution {
    // 1 ms
    // 43.7 MB
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }
}

