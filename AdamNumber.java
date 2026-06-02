public class AdamNumber {
    public static void main(String[] argu) {
        int n = 112;
        int revN = 0;
        int mainSqr = 0;
        int copyNsqr = (int) Math.pow(n, 2);

        int revSqurSqur = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            revN = revN * 10 + rem;
        }
        int sqrRev = (int) Math.pow(revN, 2);

        while (sqrRev > 0) {

            int rem = sqrRev % 10;
            sqrRev /= 10;
            mainSqr = mainSqr * 10 + rem;
        }

        if (mainSqr == copyNsqr) {
            System.out.println("Adam Number");
        } else {
            System.out.println("Not Adam Number");
        }
    }
}
