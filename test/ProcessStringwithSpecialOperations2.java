public class ProcessStringwithSpecialOperations2 {
    static char processStr(String s, long k) {
        s = s.toLowerCase();
        int n = s.length();
        long[] lengths = new long[n];
        long currLen = 0;

        for (int i = 0; i < n; i++) {
            char element = s.charAt(i);
            if (element == '#') {
                currLen *= 2;
            } else if (element == '%') {
            } else if (element == '*') {
                if (currLen > 0) {
                    currLen--;
                }
            } else {
                currLen++;
            }
            lengths[i] = currLen;
        }
        if (currLen == 0 || k < 0 || k >= currLen) {
            return '.';
        }
 
        for (int i = n - 1; i >= 0; i--) {
            char element = s.charAt(i);
            long prevLen = (i > 0) ? lengths[i - 1] : 0;

            if (element == '#') {
                if (k >= prevLen) {
                    k -= prevLen;
                }
            } else if (element == '%') {
                if (lengths[i] > 0) {
                    k = lengths[i] - 1 - k;
                }
            } else if (element == '*') {
            } else {
                if (k == prevLen) {
                    return element;
                }
            }
        }

        return '.';
    }
    public static void main(String[] argu){
        String s = "a#b%c*d";
        long k = 3; 
        System.out.println(processStr(s, k));
    }
}