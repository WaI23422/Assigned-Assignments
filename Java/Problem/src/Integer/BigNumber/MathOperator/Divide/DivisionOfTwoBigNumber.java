public class DivisionOfTwoBigNumber {
    public static void main(String[] args) {
        System.out.println(BigNumber.timesMinus("130", "002", 0)[0]);
    }
}

class BigNumber {
    /**
     * Subtract two numbers with the same length.
     * @param minuend the number from which another number is subtracted.
     * @param subtrahend the number that is subtracted from another number.
     * @param times The number of times the subtrahend has already been subtracted from the minuend.
     * @return The number of times the subtrahend has been subtracted from the minuend and the resut after minued.
     */
    public static Object[] timesMinus(String minuend, String subtrahend, int times){
        int len = minuend.length(), remainder = 0;
        int difference;
        Object[]  res = new Object[2];
        String minuendCopy = "";
        // if minued number less than subtrahend number.
        if (len != subtrahend.length()) {
            throw new Error("Two numbers don't have the same length");
        }

        if (minuend.charAt(0) - subtrahend.charAt(0) < 0) {
            res[1] = minuend.toString().replaceAll("^0+", "");
            res[0] = times;
            return res;
        }

        for (int i = len-1; i >= 0; i--) {
            if (remainder > 0) {
                difference = minuend.charAt(i)- subtrahend.charAt(i)-remainder;
                remainder = 0;
            } else {
                difference = minuend.charAt(i)- subtrahend.charAt(i);
            }

            if (i == 0 && difference < 0) {
                res[1] = minuend.toString().replaceAll("^0+", "");
                res[0] = times;
                return res;
            }

            if (difference < 0 ) {
                difference = 10 + difference;   
                remainder++;
            } 

            minuendCopy = difference + minuendCopy;
        }

        return timesMinus(minuendCopy, subtrahend, times+1);
    }

    /**
     * Divide two big numbers.
     * @param dividend the number that is being divided by another number.
     * @param divisor the number by which the dividend is being divided.
     * @param digit the number displayed after comma.
     * @return return the quotient (result of the division) of two numbers. 
     */
    public static String divide(String dividend, String divisor, int digit){
        int len1 = dividend.length(),len2 = divisor.length();
        String dividendNum, divisorNum;
        String commaDigit = "",res = "";
        int[] resArr = new int[len1-len2+1];

        // Check if it is divisible:
        if (len2 == 1 && divisor.charAt(0) == '0') {
            throw new Error("Error: Can't divive by 0");
        }

        // 0 is the dividend:
        if (len1 == 1 && dividend.charAt(0) == '0') {
            return "0";
        }

        if (len1 >= len2) {
            dividendNum = dividend.substring(0, len2);
            divisorNum = "0" + divisor.substring(0, len2-1);
            
        } else {
            for (int j = 0; j < digit; j++) {
                res += "," + commaDigit;
            }
        }

        return res;
    }
}

