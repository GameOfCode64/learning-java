
public class RichestCustomerWealth {

    static int[] findWealth(int[][] arr) {

        int wealth = 0;
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
            if (sum > wealth) {
                wealth = sum;
                sum = 0;
            } else {
                sum = 0;
            }

        }
        return new int[] { wealth };
    }

    public static void main(String[] args) {

        int[][] arr = { { 1, 5 }, { 7, 3 }, { 3, 5 } };

        int[] result = findWealth(arr);
        System.out.println(result[0]);

    }
}
