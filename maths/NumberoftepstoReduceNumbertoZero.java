
package maths;

public class NumberoftepstoReduceNumbertoZero {
    static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    static int numberOfSteps(int num) {
        int count = 0;

        while (num > 0) {
            if (!isEven(num)) {
                num = num - 1;
            } else {
                num = num / 2;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

}