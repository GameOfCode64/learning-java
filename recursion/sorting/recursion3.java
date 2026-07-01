package sorting;

public class recursion3 {

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void bubbleSort(int[] arr, int n, int i) {
        if (n == 1) {
            return;
        }

        if (i == n - 1) {
            bubbleSort(arr, n - 1, 0);
            return;
        }

        if (arr[i] > arr[i + 1]) {
            swap(arr, i, i + 1);
        }
        bubbleSort(arr, n, i + 1);

    }

    static int search(int[] arr, int row, int col, int maxIndex) {
        if (col > row) {
            return maxIndex;
        }

        if (arr[col] > arr[maxIndex]) {
            maxIndex = col;
        }

        return search(arr, row, col + 1, maxIndex);
    }

    static void selectionSort(int[] arr, int row) {
        if (row <= 0) {
            return;
        }

        int max = search(arr, row, 0, 0);

        swap(arr, max, row);

        selectionSort(arr, row - 1);

    }

    public static void main(String[] argu) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // bubbleSort(arr, arr.length, 0);
        selectionSort(arr, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}