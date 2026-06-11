public class CycleSort {

    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

    }

    public static void main(String[] argu) {
        int[] num = { 3, 6, 2, 1, 5, 4 };
        cycleSort(num);

        for (int n : num) {
            System.out.print(n + ",");
        }
    }
}
