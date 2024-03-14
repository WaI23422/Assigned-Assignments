package Medium.Array;

/**
 * <a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate cursor-text whitespace-normal hover:!text-[inherit]" href="/problems/binary-subarrays-with-sum/">930.Binary Subarrays With Sum</a>
 * 
 * <div class="elfjS" data-track-load="description_content"><p>Given a binary array <code>nums</code> and an integer <code>goal</code>, return <em>the number of non-empty <strong>subarrays</strong> with a sum</em> <code>goal</code>.</p>

<p>A <strong>subarray</strong> is a contiguous part of the array.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,0,1,0,1], goal = 2
<strong>Output:</strong> 4
<strong>Explanation:</strong> The 4 subarrays are bolded and underlined below:
[<u><strong>1,0,1</strong></u>,0,1]
[<u><strong>1,0,1,0</strong></u>,1]
[1,<u><strong>0,1,0,1</strong></u>]
[1,0,<u><strong>1,0,1</strong></u>]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [0,0,0,0,0], goal = 0
<strong>Output:</strong> 15
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 3 * 10<sup>4</sup></code></li>
	<li><code>nums[i]</code> is either <code>0</code> or <code>1</code>.</li>
	<li><code>0 &lt;= goal &lt;= nums.length</code></li>
</ul></div>
 */
public class BinarySubarraysWithSum {
    public static void main(String[] args) {
        int[][][] tests = {
            {{1,0,1,0,1},{2}},
            {{0,0,0,0,0},{0}},
            {{1},{2}}
        };

        for (int[][] test : tests) {
            int[] nums  = test[0];
            int goal  = test[1][0];

            System.out.println(new BinarySubarraysWithSum_Solution().numSubarraysWithSum(nums , goal));
        }
    }
}

// Memory Limit Exceeded
class BinarySubarraysWithSum_Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int total = 0, len = nums.length;
        int[][] dp = new int[len][len];
        
        for (int num : nums) {
            if (num == goal) {total++;}
        }

        dp[0] = nums;
        
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len-i; j++) {
                dp[i][j] += dp[i-1][j] + nums[j+i];

                if (dp[i][j] == goal) {total++;}
            }
        }

        return total;
    }
}