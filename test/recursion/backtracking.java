package recursion;

import java.util.ArrayList;

public class backtracking {

    static void subsets(int[] arr, int index, ArrayList<Integer> current) {
        if (index >= arr.length) {
            System.out.println(current);
            return;
        }
        current.add(arr[index]);
        subsets(arr, index + 1, current);

        current.remove(current.size() - 1);
        subsets(arr, index + 1, current);

    }

    static ArrayList<ArrayList<Integer>> subsetsList(int[] arr, int index, ArrayList<Integer> current) {

        if (index >= arr.length) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(current));
            return list;
        }

        current.add(arr[index]);
        ArrayList<ArrayList<Integer>> left = subsetsList(arr, index + 1, current);

        current.remove(current.size() - 1);
        ArrayList<ArrayList<Integer>> right = subsetsList(arr, index + 1, current);

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

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };

        subsetsSumFive(arr, 0, 0, 5, new ArrayList<>());
    }
}
