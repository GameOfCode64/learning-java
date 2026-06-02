public class MoveAllZerostoEnd {
    // ! Problem
    // * Move All Zeros to End
    // * Input -> { 1, 0, 3, 0, 5, 0, 7 } | Output -> {1, 3, 5, 7, 0, 0, 0}

    // * Brute Force Approach but order change
    static int[] moveleft(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            } else {
                left++;
            }

        }
        return arr;
    }

    // * Optimize Approach

    static int[] OptimizeMoveLeft(int arr[]) {

        int writePointer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[writePointer];
                arr[writePointer] = temp;

                writePointer++;
            }
        }

        return arr;
    }

    public static void main(String[] argu) {
        int[] arr = { 1, 0, 3, 0, 5, 0, 7 };
        int[] result = OptimizeMoveLeft(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
}
