package Easy.Number;

/**
 * <a class="mr-2 text-label-1 dark:text-dark-label-1 hover:text-label-1 dark:hover:text-dark-label-1 text-lg font-medium" href="/problems/count-of-matches-in-tournament/">1688.Count of Matches in Tournament</a>
 * 
 * <div class="px-5 pt-4"><div class="flex"></div><div class="xFUwe" data-track-load="description_content"><p>You are given an integer <code>n</code>, the number of teams in a tournament that has strange rules:</p>

<ul>
	<li>If the current number of teams is <strong>even</strong>, each team gets paired with another team. A total of <code>n / 2</code> matches are played, and <code>n / 2</code> teams advance to the next round.</li>
	<li>If the current number of teams is <strong>odd</strong>, one team randomly advances in the tournament, and the rest gets paired. A total of <code>(n - 1) / 2</code> matches are played, and <code>(n - 1) / 2 + 1</code> teams advance to the next round.</li>
</ul>

<p>Return <em>the number of matches played in the tournament until a winner is decided.</em></p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> n = 7
<strong>Output:</strong> 6
<strong>Explanation:</strong> Details of the tournament: 
- 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
- 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
- 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
Total number of matches = 3 + 2 + 1 = 6.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> n = 14
<strong>Output:</strong> 13
<strong>Explanation:</strong> Details of the tournament:
- 1st Round: Teams = 14, Matches = 7, and 7 teams advance.
- 2nd Round: Teams = 7, Matches = 3, and 4 teams advance.
- 3rd Round: Teams = 4, Matches = 2, and 2 teams advance.
- 4th Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
Total number of matches = 7 + 3 + 2 + 1 = 13.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 200</code></li>
</ul>
</div></div>
 */
public class CountOfMatchesInTournament {
    public static void main(String[] args) {
        int[] tests = {
            7,
            14
        };
        
        for (int n : tests) {
            System.out.println(new CountOfMatchesInTournament_Solution().numberOfMatches(n));
        }
    }
}

class CountOfMatchesInTournament_Solution {
    public int numberOfMatches(int n) {
        int ans = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                ans += n / 2;
                n = n / 2;
            } else {
                ans += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        
        return ans;
    }
}

class CountOfMatchesInTournament_Solution2 {
    // 0 ms 39.7 MB
    public int numberOfMatches(int n) {
        return n-1;
    }
}