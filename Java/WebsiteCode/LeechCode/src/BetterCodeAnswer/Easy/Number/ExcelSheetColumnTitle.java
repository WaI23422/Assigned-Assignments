package BetterCodeAnswer.Easy.Number;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int[] tests = {
            1,
            260,
            701,
            28,
            26
        };

        for (int columnNumber : tests) {
            System.out.println(new ExcelSheetColumnTitle_Solution().convertToTitle(columnNumber));
        }
    }
}

// @see Easy.Number.ExcelSheetColumnTitle.java
class ExcelSheetColumnTitle_Solution {
    public String convertToTitle(int columnNumber) {
        return "";
    }
}