package BetterCodeAnswer.Easy.Array;

/**
 * <a class="no-underline hover:text-blue-s dark:hover:text-dark-blue-s truncate cursor-text whitespace-normal hover:!text-[inherit]" href="/problems/find-first-palindromic-string-in-the-array/">2108.Find First Palindromic String in the Array</a>
 * 
 * <div class="elfjS" data-track-load="description_content"><p>Given an array of strings <code>words</code>, return <em>the first <strong>palindromic</strong> string in the array</em>. If there is no such string, return <em>an <strong>empty string</strong> </em><code>""</code>.</p>

<p>A string is <strong>palindromic</strong> if it reads the same forward and backward.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> words = ["abc","car","ada","racecar","cool"]
<strong>Output:</strong> "ada"
<strong>Explanation:</strong> The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> words = ["notapalindrome","racecar"]
<strong>Output:</strong> "racecar"
<strong>Explanation:</strong> The first and only string that is palindromic is "racecar".
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> words = ["def","ghi"]
<strong>Output:</strong> ""
<strong>Explanation:</strong> There are no palindromic strings, so the empty string is returned.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= words.length &lt;= 100</code></li>
	<li><code>1 &lt;= words[i].length &lt;= 100</code></li>
	<li><code>words[i]</code> consists only of lowercase English letters.</li>
</ul>
</div>
 */
public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {
        String[][] tests = {
            {"abc","car","ada","racecar","cool"},
            {"notapalindrome","racecar"},
            {"def","ghi"}
        };      

        for (String[] strings : tests) {
            System.out.println(new FindFirstPalindromicStringInTheArray_Solution().firstPalindrome(strings));
        }
    }
}

// @see Easy.Array.FindFirstPalindromicStringInTheArray.java
class FindFirstPalindromicStringInTheArray_Solution {
    public String firstPalindrome(String[] words) {
        return "";
    }
}