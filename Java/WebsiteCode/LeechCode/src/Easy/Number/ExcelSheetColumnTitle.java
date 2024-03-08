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

// 0 ms 40.48 MB
class ExcelSheetColumnTitle_Solution2 {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        char arr[] = new char[26]; 
        arr[0] = 'Z';
        for(int i=1;i<arr.length;i++){
            arr[i] = (char)(64+i);
        }

        while (columnNumber > 0) {
            char a = arr[columnNumber%26];
            ans = String.valueOf(a) + ans;
            columnNumber = (columnNumber-(a-64))/26;
        }   
        
        return ans;
    }
}

// 0 ms 40.35 MB
class ExcelSheetColumnTitle_Solution3 {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        char arr[] = new char[26]; 
        arr[0] = 'Z';
        for(int i=1;i<arr.length;i++){
            arr[i] = (char)(64+i);
        }

        while (columnNumber > 26) {
            char a = arr[columnNumber%26];
            ans = String.valueOf(arr[columnNumber%26]) + ans;
            if (a == 'Z') { columnNumber = columnNumber/26 -1; }
            else {columnNumber = columnNumber/26;}
        }   

        if (columnNumber != 0) {
            ans = String.valueOf(arr[columnNumber%26]) + ans;
        }
        
        return ans;
    }
}