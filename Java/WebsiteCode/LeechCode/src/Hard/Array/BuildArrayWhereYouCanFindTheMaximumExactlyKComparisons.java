package Hard.Array;

import java.util.Arrays;

/**
 * <a class="mr-2 text-label-1 dark:text-dark-label-1 hover:text-label-1 dark:hover:text-dark-label-1 text-lg font-medium" href="/problems/build-array-where-you-can-find-the-maximum-exactly-k-comparisons/">1420.Build Array Where You Can Find The Maximum Exactly K Comparisons</a>
 * 
 * <div class="px-5 pt-4"><div class="flex"></div><div class="xFUwe" data-track-load="description_content"><p>You are given three integers <code>n</code>, <code>m</code> and <code>k</code>. Consider the following algorithm to find the maximum element of an array of positive integers:</p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/04/02/e.png" style="width: 424px; height: 372px;">
<p>You should build the array arr which has the following properties:</p>

<ul>
	<li><code>arr</code> has exactly <code>n</code> integers.</li>
	<li><code>1 &lt;= arr[i] &lt;= m</code> where <code>(0 &lt;= i &lt; n)</code>.</li>
	<li>After applying the mentioned algorithm to <code>arr</code>, the value <code>search_cost</code> is equal to <code>k</code>.</li>
</ul>

<p>Return <em>the number of ways</em> to build the array <code>arr</code> under the mentioned conditions. As the answer may grow large, the answer <strong>must be</strong> computed modulo <code>10<sup>9</sup> + 7</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> n = 2, m = 3, k = 1
<strong>Output:</strong> 6
<strong>Explanation:</strong> The possible arrays are [1, 1], [2, 1], [2, 2], [3, 1], [3, 2] [3, 3]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> n = 5, m = 2, k = 3
<strong>Output:</strong> 0
<strong>Explanation:</strong> There are no possible arrays that satisify the mentioned conditions.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> n = 9, m = 1, k = 1
<strong>Output:</strong> 1
<strong>Explanation:</strong> The only possible array is [1, 1, 1, 1, 1, 1, 1, 1, 1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 50</code></li>
	<li><code>1 &lt;= m &lt;= 100</code></li>
	<li><code>0 &lt;= k &lt;= n</code></li>
</ul>
</div></div>
 */
public class BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons {
    public static void main(String[] args) {
        int n = 2, m=3,k= 1 ;
        BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons_Solution answer = new BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons_Solution();
 
        System.out.println(answer.numOfArrays(n, m, k));
    }
}

class BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons_Solution {
    int[][][] memo;
    int MOD = (int) 1e9 + 7;
    int n;
    int m;
    
    public int numOfArrays(int n, int m, int k) {
        memo = new int[n][m + 1][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }
        
        this.n = n;
        this.m = m;
        return dp(0, 0, k);
    }
    
    public int dp(int i, int maxSoFar, int remain) {
        if (i == n) {
            if (remain == 0) {
                return 1;
            }
            
            return 0;
        }
        
        if (remain < 0) {
            return 0;
        }
        
        if (memo[i][maxSoFar][remain] != -1) {
            return memo[i][maxSoFar][remain];
        }
        
        int ans = 0;
        for (int num = 1; num <= maxSoFar; num++) {
            ans = (ans + dp(i + 1, maxSoFar, remain)) % MOD;
        }

        for (int num = maxSoFar + 1; num <= m; num++) {
            ans = (ans + dp(i + 1, num, remain - 1)) % MOD;
        }
        
        memo[i][maxSoFar][remain] = ans;
        return ans;
    }
}