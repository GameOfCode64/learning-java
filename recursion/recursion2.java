import java.util.ArrayList;

public class recursion2 {
    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }

    static boolean linearSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || linearSearch(arr, target, index + 1);
    }

    static int linearSearchIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return linearSearchIndex(arr, target, index + 1);

    }

    static ArrayList<Integer> linearSearchAllIndex(int[] arr, int target, int index, ArrayList<Integer> resultList) {
        if (index == arr.length) {
            return resultList;
        }

        if (arr[index] == target) {
            resultList.add(index);
        }
        return linearSearchAllIndex(arr, target, index + 1, resultList);
    }

    static ArrayList<Integer> search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return new ArrayList<>();
        }

        ArrayList<Integer> list = search(arr, target, index + 1);

        if (arr[index] == target) {
            list.add(index);
        }
        return list;
    }

    public static void main(String[] argu) {
        int[] arr = { 1, 4, 2, 3, 4, 5 };
        // System.out.println(isSorted(arr, 0));
        // System.out.println(linearSearch(arr, 6, 0));
        // System.out.println(linearSearchIndex(arr, 5, 0));
        // ArrayList<Integer> ans = linearSearchAllIndex(arr, 4, 0, new ArrayList<>());
        // System.out.println(ans);
        System.out.println(search(arr, 4, 0));

    }
}