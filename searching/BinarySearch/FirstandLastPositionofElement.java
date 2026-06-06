public class FirstandLastPositionofElement {
    static int findIndex(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

    static int[] searchRange(int[] nums, int target) {
        int startIndex = findIndex(nums, target, true);
        int endIndex = findIndex(nums, target, false);

        return new int[] { startIndex, endIndex };
    }

    public static void main(String[] argu) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int[] result = searchRange(arr, 8);

        System.out.println(result[0] + "," + result[1]);
    }
}
