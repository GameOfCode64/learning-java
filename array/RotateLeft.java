public class RotateLeft {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int rotateLeft = 5;
        int noOfTimeRotate = 0;
        rotateLeft = rotateLeft % arr.length;
        while (rotateLeft > noOfTimeRotate) {
            int temp = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = temp;
            noOfTimeRotate++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}