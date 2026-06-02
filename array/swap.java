package array;

public class swap {

    public static void swapNum(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] argu) {
        int[] numbs = { 1, 2, 3, 4, 5 };

        swapNum(numbs, 0, 3);

        for (int i = 0; i < numbs.length; i++) {
            System.out.print(numbs[i] + ",");
        }

    }
}
