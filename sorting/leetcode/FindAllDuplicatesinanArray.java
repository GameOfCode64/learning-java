package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {
    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> dup = new ArrayList<>();

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
                dup.add(nums[j]);
            }
        }
        return dup;
    }

    public static void main(String[] args) {

        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

        List<Integer> result = findDuplicates(arr);

        System.out.println(result);

    }
}
