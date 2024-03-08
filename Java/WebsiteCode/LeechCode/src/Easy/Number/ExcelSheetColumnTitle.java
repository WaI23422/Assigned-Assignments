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

// 0 ms 40.78 MB
class ExcelSheetColumnTitle_Solution {
    public String convertToTitle(int columnNumber) {
        char arr[] = new char[27];
        String str = "";

        for(int i=1;i<arr.length;i++){
            arr[i] = (char)(64+i);
        }

        if(columnNumber > 26){
            while(columnNumber/26 >= 1){
                 
                if(columnNumber%26 <= 26){
                    if(columnNumber%26 == 0){
                        str = "Z"+str;
                        columnNumber = columnNumber-1;
                    }else {
                        str = String.valueOf(arr[columnNumber%26])+str;
                    }
                }
                if(columnNumber/26 <= 26){
                    str = String.valueOf(arr[columnNumber/26])+str;
                    break;
                }else {
                    columnNumber = columnNumber/26;
                }
            }
        }else{
            str = String.valueOf(arr[columnNumber]);
        }

        return str;
    }
}