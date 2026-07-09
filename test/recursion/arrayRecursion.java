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

    public static ArrayList<Integer> findAll(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index >= arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
            return findAll(arr, target, index + 1, list);
        }

        return findAll(arr, target, index + 1, list);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, end);
        } else {
            return binarySearch(arr, target, start, mid - 1);
        }
    }

    static int binarySearchFirstOccurrence(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            if (mid == 0 || arr[mid - 1] != target) {
                return mid;
            }
            return binarySearchFirstOccurrence(arr, target, start, mid - 1);
        }

        if (arr[mid] > target) {
            return binarySearchFirstOccurrence(arr, target, start, mid - 1);
        } else {
            return binarySearchFirstOccurrence(arr, target, mid + 1, end);
        }
    }

    static int binarySearchLastOccurrence(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            if (mid == arr.length - 1 || arr[mid + 1] != target) {
                return mid;
            }
            return binarySearchLastOccurrence(arr, target, mid + 1, end);
        }

        if (arr[mid] > target) {
            return binarySearchLastOccurrence(arr, target, start, mid - 1);
        } else {
            return binarySearchLastOccurrence(arr, target, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 4 };
        System.out.println(binarySearchLastOccurrence(arr, 2, 0, arr.length - 1));
    }
}
