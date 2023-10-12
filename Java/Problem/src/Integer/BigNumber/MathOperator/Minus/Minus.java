package Integer.BigNumber.MathOperator.Minus;

public class Minus {
    /**
     * Subtract two numbers with the same length.
     * @param minuend the number from which another number is subtracted.
     * @param subtrahend the number that is subtracted from another number.
     * @param times The number of times the subtrahend has already been subtracted from the minuend.
     * @return The number of times the subtrahend has been subtracted from the minuend and the resut after minued.
     */
    public static Object[] timesRepeat(String minuend, String subtrahend, int times){
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

        return timesRepeat(minuendCopy, subtrahend, times+1);
    }
}
