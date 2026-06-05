public class BinarySearch {
    // Normal Binary Search
    static int binarySearch(int arr[], int target) {
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

        return -1;
    }

    // Order Agnostic Binary Search;
    static int AgnosticBinarySearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
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

    public static void main(String[] argu) {
        int[] arr = { 1, 3, 4, 5, 6, 8, 10, 12, 14, 18 };
        int[] arr1 = {};

        int target = 1;

        int result = binarySearch(arr, target);
        int result2 = AgnosticBinarySearch(arr1, target);
        System.out.println(result2);

    }
}