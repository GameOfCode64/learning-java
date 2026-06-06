public class SearchinRotatedSortedArray {

    static int binarySearch(int[] arr, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target <= nums[mid]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }

        }
        System.out.println(start + "," + end);
        return binarySearch(nums, start, end, target);
    }

    public static void main(String[] argu) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 1;

        int result = search(arr, target);
        System.out.println(result);
    }
}
