package recursion;

import java.util.ArrayList;
import java.util.List;

// testing go
public class backtracking {

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = subsetsList(nums, 0, new ArrayList<>());

        return result;
    }

    static void subsets2(int[] arr, int index, ArrayList<Integer> current) {
        if (index >= arr.length) {
            System.out.println(current);
            return;
        }
        current.add(arr[index]);
        subsets2(arr, index + 1, current);

        current.remove(current.size() - 1);
        subsets2(arr, index + 1, current);

    }

    static List<List<Integer>> subsetsList(int[] arr, int index, ArrayList<Integer> current) {

        if (index >= arr.length) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(current));
            return list;
        }

        current.add(arr[index]);
        List<List<Integer>> left = subsetsList(arr, index + 1, current);

        current.remove(current.size() - 1);
        List<List<Integer>> right = subsetsList(arr, index + 1, current);

        left.addAll(right);
        return left;
    }

    static void subsetsOfSizeTwo(int[] arr, int index, ArrayList<Integer> current) {

        if (current.size() == 2) {
            System.out.println(current);
            return;
        }

        if (index >= arr.length) {
            return;
        }
        current.add(arr[index]);
        subsetsOfSizeTwo(arr, index + 1, current);

        current.remove(current.size() - 1);
        subsetsOfSizeTwo(arr, index + 1, current);
    }

    static void subsetsSumFive(int[] arr, int index, int sum, int target, ArrayList<Integer> current) {

        if (sum == target) {
            System.out.println(current);
            return;
        }

        if (index >= arr.length) {
            return;
        }
        current.add(arr[index]);
        subsetsSumFive(arr, index + 1, sum + arr[index], target, current);

        current.remove(current.size() - 1);
        subsetsSumFive(arr, index + 1, sum, target, current);

    }

    static void subsetsOfSumLessTarget(int[] arr, int index, int sum, int target, ArrayList<Integer> current) {

        if (index >= arr.length) {
            if (sum < target) {
                System.out.println(current);
            }
            return;
        }
        if (sum >= target) {
            return;
        }

        current.add(arr[index]);
        subsetsOfSumLessTarget(arr, index + 1, sum + arr[index], target, current);

        current.remove(current.size() - 1);
        subsetsOfSumLessTarget(arr, index + 1, sum, target, current);
    }

    private static final Map<Character, String> PHONE_MAP = Map.of(
        '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
        '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        backtrack(0, digits, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int index, String digits, StringBuilder path, List<String> result) {
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = PHONE_MAP.get(digit);

        for (int i = 0; i < letters.length(); i++) {
            path.append(letters.charAt(i));
            backtrack(index + 1, digits, path, result);
            path.deleteCharAt(path.length() - 1); 
        }
    }


    public static void main(String[] args) {

        int[] arr = { 1, 3, 4 };

        subsetsOfSumLessTarget(arr, 0, 0, 6, new ArrayList<>());
    }
}
