public class CheckifArrayisSorted {
    static boolean isSorted(int arr[]) {

        boolean Sorted = true;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                if (arr[i] < arr[i + 1]) {
                    Sorted = true;
                } else {
                    return false;
                }
            }
        }

        return Sorted;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 7, 3, 4, 5 };
        System.out.println(isSorted(arr));

    }
}
