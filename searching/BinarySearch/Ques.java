
public class Ques {
    // ! Q1, Implement Binary Search from memory.

    static int Binary(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        boolean isAce = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAce) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    // ! return the index where it should be inserted or return its index

    static int findIndex(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return start;
    }

    // ! Find the smallest number that is: in largest

    static int findSmallest(int[] arr, int target) {
        int smallest = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                smallest = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return smallest;
    }

    public static void main(String[] argu) {
        int[] nums = { 2, 3, 5, 9, 14, 16, 18 };

        int result1 = Binary(nums, 5);
        int result2 = findIndex(nums, -1);
        int result3 = findSmallest(nums, 15);
        // System.out.println(result1);
        // System.out.println(result2);
        System.out.println(result3);

    }
}
