public class MinimumOperations {

    static int findMin(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != k) {
                while (nums[i] != k) {
                    if (nums[i] < k) {
                        nums[i] += 1;

                    } else {
                        nums[i] -= 1;
                    }
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] argu) {

        int[] arr = { 1, 2, 3 };

        System.out.println(findMin(arr, 4));
    }
}