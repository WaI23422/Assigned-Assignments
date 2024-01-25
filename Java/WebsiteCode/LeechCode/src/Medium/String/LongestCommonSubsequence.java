package Medium.String;

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

// 10 ms 50.7 MB
class LongestCommonSubsequence_Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] string1 = text1.toCharArray();
        char[] string2 = text2.toCharArray();
        int[][] memo = new int[string1.length + 1][string2.length + 1];

        for (int i=1; i<string1.length + 1; i++) {
            for (int j=1; j<string2.length + 1; j++) {
                if (string1[i - 1] == string2[j - 1]) {
                    memo[i][j] = memo[i - 1][j - 1] + 1;
                } else {
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
                }
            }
        }

        return memo[string1.length][string2.length];
    }
}