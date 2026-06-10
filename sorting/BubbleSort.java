
public class BubbleSort {
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {

        int[] arr = { 11, 13, 4, 18, 16, 15, 12 };

        bubbleSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}