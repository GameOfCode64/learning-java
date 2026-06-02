package array;

public class ReverseArray {
    static int[] reverse(int arr[]) {
        int length = arr.length;
        int[] reverseArray = new int[length];

        int j = length;
        System.out.println(length);

        for (int i = 0; i < arr.length; i++) {
            reverseArray[j - 1] = arr[i];
            j--;
        }
        return reverseArray;
    }

    static int[] rev(int arr[]) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] numbs = { 1, 2, 3, 4, 5, 25 };
        int[] rev = rev(numbs);

        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + ",");
        }
    }

}