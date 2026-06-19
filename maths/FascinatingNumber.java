package maths;

public class FascinatingNumber {
    // ! Fascinating Number

    // * */ A number is called Fascinating if:

    // * */ It is a 3-digit number.
    // * */ Concatenate:
    // * */ the number
    // * */ the number × 2
    // * */ the number × 3
    // * */ The resulting string contains all digits:

    // ! Case:- 192
    // ! 192 x 1, 192 x 2, 192 x 3;
    // ! result all number 1 to 9

    public static void main(String[] argu) {
        int n = 111;
        int multi = 0;
        int[] nums = new int[10];
        boolean isFascinating = true;
        int counter = 0;

        for (int i = 1; i <= 3; i++) {
            multi = n * i;
            while (multi > 0) {
                int rem = multi % 10;
                multi /= 10;
                nums[rem]++;
            }
        }

        if (nums[0] > 0) {
            isFascinating = false;
        }

        for (int i = 1; i <= 9; i++) {
            if (nums[i] != 1) {
                isFascinating = false;
                break;
            }
        }

        System.out.println(isFascinating);
    }
}
