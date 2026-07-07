package recursion;

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

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 3, 5 };
        System.out.println(findMaxWithoutAcc(arr, 0));

    }
}
