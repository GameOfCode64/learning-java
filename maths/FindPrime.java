package maths;

import java.util.Scanner;

public class FindPrime {

    // ! Find the No is Prime or not

    public static void main(String[] argu) {
        int n;
        boolean isPrime = true;
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        n = sn.nextInt();

        if (n <= 1) {
            isPrime = false;
        } else {
            isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime);
    }
}
