public class SmallestDigit {
    public static void main(String[] argu) {
        int testCase = 5821;
        int small = testCase % 10;
        while (testCase > 0) {
            int rem = testCase % 10;
            testCase = testCase / 10;

            if (rem < small) {
                small = rem;
            }
        }
        System.out.println(small);
    }
}
