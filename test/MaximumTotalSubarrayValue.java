public class MaximumTotalSubarrayValue {

    public static void main(String[] args) {
        int[] nums = { 1, 3, 2 };
        int k = 3;
        long ans = 0;
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        System.out.println(min + "," + max);

        long temp = max - min;

        ans = temp * k;

        System.out.println(ans);
    }
}