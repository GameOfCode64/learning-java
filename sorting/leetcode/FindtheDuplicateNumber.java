package leetcode;

public class FindtheDuplicateNumber {

    static void swap(int arr[], int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndx = nums[i] - 1;
            if (nums[i] != nums[correctIndx]) {
                swap(nums, i, correctIndx);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return nums[j];
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 3, 3, 3, 3 };

        int result = findDuplicate(arr);

        // for (int i : arr) {
        // System.out.print(i + ",");
        // }
        System.out.println(result);
    }

}