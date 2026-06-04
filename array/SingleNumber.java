public class SingleNumber {
    // ! Brute Force
    static int findSingleNumber(int arr[]) {
        if (arr.length < 1) {
            return -1;
        }
        int element = 0;

        if (arr.length == 1) {
            return arr[0];
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                element = arr[i];
                return arr[i];
            }
        }
        return element;
    }

    // Optimized Solution

    static int OptimizedFindSingleNumber(int arr[]) {
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            element = element ^ arr[i];
        }

        return element;
    }

    public static void main(String[] argu) {
        int[] arr = {};

        int result = findSingleNumber(arr);
        int optimizedResult = OptimizedFindSingleNumber(arr);

        System.out.println(5 ^ 2);

    }
}
