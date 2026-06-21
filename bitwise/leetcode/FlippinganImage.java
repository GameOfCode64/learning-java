public class FlippinganImage {
    static void reverse(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr[i].length - 1;

            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        reverse(image);

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] ^= 1;
            }
        }

        return image;
    }

    public static void main(String[] args) {

        int[][] arr = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] result = flipAndInvertImage(arr);

    }
}
