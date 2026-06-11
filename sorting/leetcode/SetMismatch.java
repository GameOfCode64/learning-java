package leetcode;

public class SetMismatch {
    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

    static int[] findErrorNums(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int cIndx = nums[i] - 1;
            if (nums[i] != nums[cIndx]) {
                swap(nums, i, cIndx);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[] { nums[j], j + 1 };
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 };

        int[] result = findErrorNums(arr);
        System.out.println(result[0] + "," + result[1]);
    }
}
