package Easy.String;

/**
 * <a class="mr-2 text-label-1 dark:text-dark-label-1 hover:text-label-1 dark:hover:text-dark-label-1 text-lg font-medium" href="/problems/minimum-changes-to-make-alternating-binary-string/">1758.Minimum Changes To Make Alternating Binary String</a>
 * 
 * <div class="px-5 pt-4"><div class="flex"></div><div class="xFUwe" data-track-load="description_content"><p>You are given a string <code>s</code> consisting only of the characters <code>'0'</code> and <code>'1'</code>. In one operation, you can change any <code>'0'</code> to <code>'1'</code> or vice versa.</p>

<p>The string is called alternating if no two adjacent characters are equal. For example, the string <code>"010"</code> is alternating, while the string <code>"0100"</code> is not.</p>

<p>Return <em>the <strong>minimum</strong> number of operations needed to make</em> <code>s</code> <em>alternating</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "0100"
<strong>Output:</strong> 1
<strong>Explanation:</strong> If you change the last character to '1', s will be "0101", which is alternating.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "10"
<strong>Output:</strong> 0
<strong>Explanation:</strong> s is already alternating.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> s = "1111"
<strong>Output:</strong> 2
<strong>Explanation:</strong> You need two operations to reach "0101" or "1010".
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
	<li><code>s[i]</code> is either <code>'0'</code> or <code>'1'</code>.</li>
</ul>
</div></div>
 */
public class MinimumChangesToMakeAlternatingBinaryString {
    public static void main(String[] args){
        String[] tests = {
            // "0100",
            // "10",
            // "00",
            // "1111",
            // "01001",
            // "11100101100111111101100101110101101010111",
            "10010100"
        };

        for (String s : tests) {
            System.out.println(new MinimumChangesToMakeAlternatingBinaryString_Solution().minOperations(s));
        }
    }
}

// 4 ms 43 MB
class MinimumChangesToMakeAlternatingBinaryString_Solution {
    public int minOperations(String s) {
        char[] sChars = s.toCharArray();
        int total1 = 0,total2 = 0;

        for (int i = 1; i < sChars.length; i++) {
            if (sChars[i] == sChars[i-1]) {
                total1++; 
                sChars[i] = (char) (97 - sChars[i-1]);
            }
        }
        
        sChars = s.toCharArray();
        sChars[0] = (char) (97 - sChars[0]);

        for (int i = 1; i < sChars.length; i++) {
            if (sChars[i] == sChars[i-1]) {
                total2++; 
                sChars[i] = (char) (97 - sChars[i-1]);
            }
        }

        return Math.min(total1, total2+1);
    }
}