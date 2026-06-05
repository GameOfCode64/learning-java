
public class LinearSearch {
    static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    static int[] linearSearch2d(int[][] arr2d, int target2d) {
        for (int row = 0; row < arr2d.length; row++) {

            for (int col = 0; col < arr2d[row].length; col++) {
                if (arr2d[row][col] == target2d) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    };

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        int target2d = 4;
        int[][] arr2d = {
                { 1, 2, 3, 45 },
                { 12, 16, 18, 24 },
                { 7, 4, 2, 1 }
        };

        System.out.println(java.util.Arrays.toString(linearSearch2d(arr2d, target2d)));

    }

}
