public class MaximumTotalSubarrayValue {

    public static void main(String[] args) {
        int[] nums = { 11, 8 };
        int k = 2;
//  hi hello 
        long ans = 0;
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        System.out.println(min + "," + max);

        long temp = max - min;

        System.out.println(temp);

        ans = temp * k;

        System.out.println(ans);
    }
}