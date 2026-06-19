package maths;

public class Perfect {
    // ! Problem
    // ! A number is called a Perfect Number if (sum of its proper divisors = the
    // ! number itself) like : 6 , 28

    public static void main(String[] argu) {
        int num = 28;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println("That is Prefect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}
