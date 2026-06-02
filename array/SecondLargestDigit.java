public class SecondLargestDigit {
    // * */ Brute Force Approach
    static int findLargest(int arr[]) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    static int findSecondLargest(int arr[], int largest) {
        int secondLargest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    // * Optimize Approach

    static int OptimizeSecondLargest(int arr[]) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] argu) {
        int[] arr = { 1, 3, 7, 55, 4 };

        int largest = findLargest(arr);
        int secLargest = findSecondLargest(arr, largest);

        int opt = OptimizeSecondLargest(arr);
        System.out.println(opt);
        System.out.println(secLargest);
    }
}