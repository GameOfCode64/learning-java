public class RotateRight {

    static int[] RightRotate(int arr[], int times) {
        times = times % arr.length;
        int counter = 0;

        while (times > counter) {
            int temp = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = temp;
            counter++;
        }

        return arr;
    }

    public static void main(String[] argu) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int rightRotation = 2;

        int[] res = RightRotate(arr, rightRotation);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ",");
        }
    }
}
