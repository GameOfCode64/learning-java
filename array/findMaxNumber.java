public class findMaxNumber {
    static int max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] argu) {
        int[] numbs = { 1, 2, 3, 4, 5, 25 };
        System.out.println(max(numbs));
    }
}
