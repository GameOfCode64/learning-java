package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> missingNums = new ArrayList<>();
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
                missingNums.add(j + 1);
            }
        }

        return missingNums;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        List<Integer> result = findDisappearedNumbers(arr);
        System.out.println(result);
    }
}
