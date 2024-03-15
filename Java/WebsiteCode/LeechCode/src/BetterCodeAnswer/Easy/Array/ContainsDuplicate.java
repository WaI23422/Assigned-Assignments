package BetterCodeAnswer.Easy.Array;

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

// 6 ms 54.9 MB
class ContainsDuplicate_Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        while(!flag) {
            flag = true;
            for (int i = 0; i < nums.length-1; i++) {
                if(nums[i] > nums[i+1]) {
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    flag = false;
                }
                if(nums[i] == nums[i+1])
                    return true;
            }
        }
        return false;
    }
}

// 2ms 59.9MB
class ContainsDuplicate_Solution2 {
    public boolean containsDuplicate(int[] nums) {
        final int length = nums.length;
        if (length == 1)
            return false;
        if (length == 2)
            return nums[0] == nums[1];

        for (int i = 1; i < length; i++) {
            final int current = nums[i];
            int j = i - 1, jval = nums[j];
            if (current < jval) {
                while (true) {
                    nums[j + 1] = jval;
                    if (j-- == 0)
                        break;
                    jval = nums[j];
                    if (current >= jval)
                        break;
                }
                nums[j + 1] = current;
            }

            if (j > -1 && current == jval)
                return true;
        }

        return false;
    }
}