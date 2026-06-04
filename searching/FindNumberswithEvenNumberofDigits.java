
public class FindNumberswithEvenNumberofDigits {
    static boolean even(int num) {
        int count = 0;

        while (num > 0) {
            num /= 10;
            count++;
        }

        if (count % 2 == 0) {
            return true;
        }

        return false;
    }

    static int findNumbers(int[] nums) {

        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 0 };
        System.out.println(findNumbers(arr));
    }
}
