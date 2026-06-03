public class UnionofTwoSortedArrays {

    // Bruit force
    static int[] MergeArray(int arr1[], int arr2[]) {
        int[] arr = new int[arr1.length + arr2.length];

        // Add Array 1 to new array
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        // Add Array 2 to new array
        for (int i = 0; i < arr2.length; i++) {
            arr[i + arr1.length] = arr2[i];
        }

        // Sort the array
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        int writePtr = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[writePtr] = arr[i];
                writePtr++;
            }
        }

        return arr;
    }

    static int[] OptmizeMergeArray(int arr1[], int arr2[]) {
        int[] mergeArray = new int[arr1.length + arr2.length];
        int writePtr = 0;

        int left = 0;
        int right = 0;
        int val = 0;
        while (left < arr1.length && right < arr2.length) {

            if (arr1[left] < arr2[right]) {
                val = arr1[left++];
            } else if (arr1[left] > arr2[right]) {
                val = arr2[right++];
            } else {
                val = arr1[left];
                left++;
                right++;
            }

            if (writePtr == 0 || mergeArray[writePtr - 1] != val) {
                mergeArray[writePtr++] = val;
            }
        }

        // Inset the remaining Element of Array 1
        while (left < arr1.length) {
            if (writePtr == 0 || mergeArray[writePtr - 1] != arr1[left]) {
                mergeArray[writePtr] = arr1[left];
            }
            left++;

        }
        // Inset the remaining Element of Array 2
        while (right < arr2.length) {
            if (writePtr == 0 || mergeArray[writePtr - 1] != arr2[right]) {
                mergeArray[writePtr] = arr2[right];
            }
            right++;
        }

        return mergeArray;
    }

    public static void main(String[] argu) {
        int[] arr1 = { 1, 2, 2, 4 };
        int[] arr2 = { 2, 2, 5 };

        int[] result = OptmizeMergeArray(arr1, arr2);

        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0) {
                System.out.print(result[i] + ",");
            }
        }

    }

}
