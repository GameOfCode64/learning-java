package maths;

public class LCM {
    public static void main(String[] argu) {
        int a = 7;
        int b = 11;
        int limit = 0;
        int LCM = 0;

        // Optimize Approach

        if (a < b) {
            limit = b;
        } else {
            limit = a;
        }

        for (int i = limit; i < limit * limit; i++) {
            if (i % a == 0 && i % b == 0) {
                LCM = i;
                break;
            }
        }

        System.err.println(LCM);
    }
}
