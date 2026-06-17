package leetcode;

import java.math.BigInteger;

public class MultiplyStrings {
    static String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);

        BigInteger product = n1.multiply(n2);
        return product.toString();
    }

    public static void main(String[] args) {
        String num1 = "6913259244";
        String num2 = "71103343";
        System.out.println(multiply(num1, num2)); // Output: 56088
    }

}
