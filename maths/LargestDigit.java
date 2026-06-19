package maths;

public class LargestDigit {
    public static void main(String[] argu) {
        int num = 1234;
        int large = 0;
        while (num > 0) {
            int temp = num % 10;
            num = num / 10;
            if (temp > large) {
                large = temp;
            }
        }
        System.out.println(large);
    }

}
