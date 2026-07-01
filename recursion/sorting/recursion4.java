import java.util.Arrays;

public class recursion4 {
    static int[] mergeSort(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mergedArray = new int[left.length + right.length];

        int leftPtr = 0;
        int rightPtr = 0;
        int counter = 0;

        while (leftPtr < left.length && rightPtr < right.length) {

            if (left[leftPtr] <= right[rightPtr]) {
                mergedArray[counter] = left[leftPtr];
                leftPtr++;
            } else {
                mergedArray[counter] = right[rightPtr];
                rightPtr++;
            }
            counter++;

        }

        while (leftPtr < left.length) {
            mergedArray[counter] = left[leftPtr];
            leftPtr++;
            counter++;
        }

        while (rightPtr < right.length) {
            mergedArray[counter] = right[rightPtr];
            rightPtr++;
            counter++;
        }

        return mergedArray;

    }

    // In Place Merge Sort

    static void inPlaceMergeSort(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (e + s) / 2;

        inPlaceMergeSort(arr, s, mid);
        inPlaceMergeSort(arr, mid, e);

        inPlaceMerge(arr, s, mid, e);
    }

    private static void inPlaceMerge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };

        inPlaceMergeSort(arr, 0, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}