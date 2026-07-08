package recursion;

import java.util.ArrayList;

public class arrayRecursion {

    public static void printElement(int[] arr, int index) {
        if (index >= arr.length) {
            return;
        }
        System.out.println(arr[index]);
        printElement(arr, index + 1);
    }

    public static int sumOfElements(int[] arr, int index, int sum) {
        if (index >= arr.length) {
            return sum;
        }

        return sumOfElements(arr, index + 1, sum += arr[index]);

    }

    public static int sumOfElementsWithoutAccumulator(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }

        return arr[index] + sumOfElementsWithoutAccumulator(arr, index + 1);
    }

    public static int findMax(int[] arr, int index, int max) {

        if (index >= arr.length) {
            return max;
        }

        if (arr[index] > max) {
            max = arr[index];
        }

        return findMax(arr, index + 1, max);

    }

    public static int findMaxWithoutAcc(int[] arr, int index) {

        if (index == arr.length - 1) {
            return arr[index];
        }
        int maxRest = findMaxWithoutAcc(arr, index + 1);

        return arr[index] > maxRest ? arr[index] : maxRest;
    }

    public static boolean isSorted(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return isSorted(arr, index + 1);
    }

    public static int LinearSearch(int arr[], int index, int target) {
        if (index > arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }

        return LinearSearch(arr, index + 1, target);
    }

    public static int countOccurrences(int[] arr, int index, int target) {
        if (index >= arr.length) {
            return 0;
        }

        return arr[index] == target ? 1 + countOccurrences(arr, index + 1, target)
                : countOccurrences(arr, index + 1, target);
    }

    public static ArrayList<Integer> countOccurrencesWithIndex(int[] arr, int index, int target) {

        if (index >= arr.length) {
            return new ArrayList<>();
        }

        ArrayList<Integer> list = countOccurrencesWithIndex(arr, index + 1, target);

        if (arr[index] == target) {
            list.add(index);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 5, 9, 5, 4, 3 };
        System.out.println(countOccurrencesWithIndex(arr, 0, 5));
    }
}
