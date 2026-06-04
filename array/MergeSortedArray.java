public class MergeSortedArray {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };
        int[] arr = new int[arr1.length + arr2.length];

        int left = 0;
        int right = 0;
        int writePtr = 0;

        while (left < arr1.length && right < arr2.length) {
            // System.out.print("{" + left + "," + right + "}");

            if (arr1[left] <= arr[left]) {
                arr[writePtr++] = arr1[left++];
            } else {
                arr[writePtr++] = arr2[right++];
            }
        }
        // Copy any remaining elements from arr1
        while (left < arr1.length) {
            arr[writePtr++] = arr1[left++];
        }

        // Copy any remaining elements from arr2
        while (right < arr2.length) {
            arr[writePtr++] = arr2[right++];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
            }
        }
    }
}