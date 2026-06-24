package bitwise;

import java.util.ArrayList;

public class bitwise2 {
    static int checkElement(int[] arr) {
        int element = 0;
        for (int num : arr) {
            element ^= num;
        }
        return element;
    }

    static int findMagicNumber(int n) {
        int ans = 0;

        int base = 5;

        while (n > 0) {
            int last = n & 1;
            n = n >> 1;

            ans += last * base;
            base = base * 5;
        }
        return ans;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        int[] arr = { 1, 1, 2, 2, 4, 3, 3, 5, 5 };
        // System.out.println(checkElement(arr));
        System.out.println(findMagicNumber(5));
    }
}
