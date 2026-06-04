public class MaximumConsecutiveOnes {
    static int maxCount(int arr[]) {
        int count = 0;
        int maxCount = 0;

        int left = 0;

        while (left < arr.length) {
            if (arr[left] == 1) {
                count++;
                if (maxCount < count) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }

            left++;

        }

        return maxCount;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 1 };
        int result = maxCount(arr);
        System.out.println(result);
    }
}
