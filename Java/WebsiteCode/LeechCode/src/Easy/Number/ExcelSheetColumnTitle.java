package Easy.Number;

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

// 0 ms 40.8 MB
class ExcelSheetColumnTitle_Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        
        while (columnNumber > 0) {
            char a = (char) (64 + (columnNumber%26 == 0? 26: columnNumber%26));
            ans.append(a);
            columnNumber = (columnNumber-(a-64))/26;
        }   
        
        return ans.reverse().toString();
    }
}