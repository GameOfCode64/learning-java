public class RemoveDuplicatesfromSortedArray {

    // ! Remove Duplicates from Sorted Array
    // * Input -> {1, 1, 2, 2, 3, 4, 4, 5};
    // * Output -> {1, 2, 3, 4, 5}

    // Bruit force Approach
    static int[] removeDuplicates(int arr[]) {

        int[] unique = new int[arr.length];
        int writePtr = 0;
        unique[writePtr] = arr[0];
        writePtr++;

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("Array is Not Sorted");
                    return unique;
                }
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                int temp = arr[i];
                unique[writePtr] = temp;
                writePtr++;
            }

        }

        return unique;
    }

    // Optimized removeDuplicates

    static int[] removeDuplicatesOptimized(int arr[]) {

        int writePtr = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[writePtr] = arr[i];
                writePtr++;
            }
        }
        return arr;
    }

    public static void main(String[] argu) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5 };

        int[] res = removeDuplicates(arr);

        int[] Optres = removeDuplicatesOptimized(arr);

        for (int i = 0; i < 5; i++) {
            System.out.print(Optres[i] + ",");
        }

        System.out.println();

        for (int i = 0; i < res.length; i++) {
            if (res[i] > 0) {
                System.out.print(res[i] + ",");
            }
        }

    }

}
