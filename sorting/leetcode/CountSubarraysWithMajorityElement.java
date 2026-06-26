public class CountSubarraysWithMajorityElement {
    static int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int targetCount = 0;

            for (int j = i; j < nums.length; j++) {
                if (nums[j] == target) {
                    targetCount++;
                }

                int subarrayLength = j - i + 1;

                if (targetCount * 2 > subarrayLength) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] argu) {
        int[] arr = { 1, 2, 2, 3 };
        System.out.println(countMajoritySubarrays(arr, 2));
    }
}