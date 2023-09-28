package ProgrammingSkills.Easy;
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
public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        Solution solution = new Solution();

        System.out.println(solution.mergeAlternately(word1, word2));
    }
}

class Solution {
    // 7 ms
    // 42 MB
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int lenShort;
        int lenLong;
        String LongerString;
        if (word1.length() < word2.length()) {
            lenShort = word1.length();
            lenLong = word2.length();
            LongerString = word2;
        } else {
            lenShort = word2.length();
            lenLong = word1.length();
            LongerString = word1;
        }

        for (int i = 0; i < lenShort; i++) {
            res += Character.toString(word1.charAt(i)) + Character.toString(word2.charAt(i));    
        }
        
        if (word1.length() != word2.length()) {
            for (int i = lenShort ; i < lenLong; i++) {
                res += Character.toString(LongerString.charAt(i));
            }
        }

        return res;
    }
}
