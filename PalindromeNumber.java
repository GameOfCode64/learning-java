public class PalindromeNumber {
    public static void main(String[] argu) {
        int n = 121;
        int copy = n;
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            rev = rev * 10 + rem;
        }

        if (rev == copy) {
            System.out.println("The Number is Palindrome");
        } else {
            System.out.println("The Number is Not Palindrome");
        }
    }
}
