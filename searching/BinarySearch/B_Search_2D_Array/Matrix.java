public class Matrix {

    // ! Binary Search in 2D Array
    static int[] BinarySearch(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return new int[] { row, col };
            }
            //
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return new int[] { -1, -1 };
    }

    // ! Find the maximum element in a 2D array.
    static int findmax(int[][] matrix) {

        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                max = Math.max(max, matrix[i][j]);
            }
        }

        return max;
    }

    // ! Linear Search in 2D Array
    static int[] LinearSearch(int arr[][], int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
    }

    // ! Find the row having the largest sum.
    static int findSum(int[][] arr) {
        int sum = 0;
        int row = 0;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                currentSum += arr[i][j];
            }
            if (currentSum > sum) {
                sum = currentSum;
                row = i;
            }
            currentSum = 0;
        }

        return row;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 7, 25, 6, 8 },
                { 4, 85, 19, 9 }
        };
        // int[] result = LinearSearch(arr, 25);

        System.out.println(arr.length);

        // System.out.println(findmax(arr));
        // System.out.println(findSum(arr));

        // System.out.println("{" + result[0] + "," + result[1] + "}");
    }
}