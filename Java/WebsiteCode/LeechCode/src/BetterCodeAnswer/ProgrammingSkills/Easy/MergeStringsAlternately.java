package BetterCodeAnswer.ProgrammingSkills.Easy;
/**
 * <html>
 *     <head>
 *         <style TYPE="text/css">
 *              li {margin-bottom:2em;}
 *         </style>
 *     </head>
 *     <body>
 *           Problem: You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 *              <ul>    
 *                  <li> Return the merged string.
 *              </ul> 
 *     </body>
 * </html>
 */
class Solution {
    // 0 ms
    // 40.6 MB
    public String mergeAlternately(String word1, String word2) {
        int len = word1.length() + word2.length();
        int i, j;
        char[] arr = new char[len];

        if (word1.length() < word2.length()) {
            j = 0;
            for (i = 0; i < word1.length(); i++) {
                arr[j] = word1.charAt(i);
                arr[j+1] = word2.charAt(i);
                j+=2;
            }

            while (j < len) {
                arr[j++] = word2.charAt(i++);
            }
        }
        else {
            j = 0;

            for (i = 0; i < word2.length(); i++) {
                arr[j] = word1.charAt(i);
                arr[j+1] = word2.charAt(i);
                j+=2;
            }

            while (j < len) {
                arr[j++] = word1.charAt(i++);
            }
        }
        return new String(arr);
    }
}

class Solution2 {
    // 1 ms
    // 40.8 MB
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}