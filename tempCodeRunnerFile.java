public class tempCodeRunnerFile {

    static int[] moveleft(int arr[]) {
        int writePointer = 0; // Tracks where the next non-zero number goes

        for (int i = 0; i < arr.length; i++) {
            // If we find a non-zero element, swap it to the front
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[writePointer];
                arr[writePointer] = temp;

                writePointer++; // Move the write pointer forward
            }
        }
        return arr;
    }

    public static void main(String[] argu) {
        int[] arr = { 1, 0, 3, 0, 5, 0, 7 };
        int[] result = moveleft(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
}