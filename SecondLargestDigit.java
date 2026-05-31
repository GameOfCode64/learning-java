public class SecondLargestDigit {
    public static void main(String[] argu) {
        int n = 9785;
        int largest = -1;
        int secLargest = -1;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            if (rem > largest) {
                secLargest = largest;
                largest = rem;
            } else if (rem > secLargest && rem != largest) {
                secLargest = rem;
            }
        }
        System.out.println(largest + "," + secLargest);
    }
}
