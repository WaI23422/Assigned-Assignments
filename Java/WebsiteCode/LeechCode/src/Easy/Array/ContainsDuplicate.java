package Easy.Array;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[][] tests = {
            {7,1,5,3,6,4},
            {7,6,4,3,1},
            {3,1,2,4,1,5,4},
            {2,5,1,4}
        };

        for (int[] nums : tests) {
            System.out.println(new ContainsDuplicate_Solution().containsDuplicate(nums));
        }
        
    }   
}

// 20ms 55.18MB
class ContainsDuplicate_Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length;i++) {
            if (nums[i-1] == nums[i]) {return true;}
        }

        return false;
    }
}