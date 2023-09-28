package Easy;
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
public class TwoSum {
    public static void main(String[] args) {
        int[] numb = {2,7,11,15};
        Solution solution = new Solution();
        
        System.out.println(solution.twoSum(numb, 9));;
    }
}

class Solution{
    // 46 ms
    // 43.5 MB
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }

        return null;
    }
}
