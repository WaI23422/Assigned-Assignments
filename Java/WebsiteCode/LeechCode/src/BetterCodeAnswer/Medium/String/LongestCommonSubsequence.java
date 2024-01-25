package BetterCodeAnswer.Medium.String;

/**
 * LongestCommonSubsequence
 */
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String[][] tests = {
            {"abcde","ace" },
            {"abc","abc"},
            {"abc","def"},
            {"ezupkr","ubmrapg"}
        };

        for (String[] strings : tests) {
            String text1 = strings[0], text2 = strings[1];

            System.out.println(new LongestCommonSubsequence_Solution().longestCommonSubsequence(text1, text2));
        }
    }
}

// 6 ms 41.4 MB
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1.equals(text2))
           return text1.length();
        
        char tb1[] = text1.toCharArray();
        char tb2[] = text2.toCharArray();

        if(tb1.length > tb2.length) {
            int dp[] = new int[tb1.length + 1];
            for(int i = 0; i < tb2.length; i++) {
                int pc = 0, prc;
                for(int j = 0; j < tb1.length; j++) {
                    prc = pc;
                    pc = dp[j + 1];
                    if(tb2[i] == tb1[j]) {
                        dp[j + 1] = prc + 1;
                    } else {
                        dp[j + 1] = Math.max(pc, dp[j]);
                    }
                }
            }

            return dp[tb1.length];
        } else {
            int dp[] = new int[tb2.length + 1];
            for(int i = 0; i < tb1.length; i++) {
                int pc = 0, prc;
                for(int j = 0; j < tb2.length; j++) {
                    prc = pc;
                    pc = dp[j + 1];
                    if(tb1[i] == tb2[j]) {
                        dp[j + 1] = prc + 1;
                    } else {
                        dp[j + 1] = Math.max(pc, dp[j]);
                    }
                }
            }

            return dp[tb2.length];
        }
    }
}

// 20 ms 51 MB
class LongestCommonSubsequence_Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // Lengths of the input strings
        int length1 = text1.length();
        int length2 = text2.length();
      
        // Create a 2D array to store the lengths of longest common subsequences
        // for all subproblems, initialized with zero
        int[][] dp = new int[length1 + 1][length2 + 1];

        // Build the dp array from the bottom up
        for (int i = 1; i <= length1; ++i) {
            for (int j = 1; j <= length2; ++j) {
                // If characters match, take diagonal value and add 1
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                // If characters do not match, take the maximum value from 
                // the left (dp[i][j-1]) or above (dp[i-1][j])
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        // The bottom-right cell contains the length of the longest
        // common subsequence of text1 and text2
        return dp[length1][length2];
    }
}