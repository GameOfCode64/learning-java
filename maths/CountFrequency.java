package maths;

public class CountFrequency {
    // ! Problem
    // ! Given a number, print how many times each digit appears.
    public static void main(String[] argu) {
        int num = 505050;
        int[] count = new int[10];

        while (num > 0) {
            int digit = num % 10;
            count[digit]++;
            num /= 10;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(i + " appears " + count[i] + " times.");
            }
        }
    }
}
