public class test1 {
    // ! Test One of DSA Till Binary Search | Array | Number System

    // ! Q1 Best Time to Buy and Sell Stock

    static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    // ! Q2 Two Sum

    static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }

            }
        }

        return new int[] {};
    }

    // ! Q3 Single NUmber
    static int singleNumber(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int element = 0;

        for (int i = 0; i < nums.length; i++) {
            element ^= nums[i];
        }

        return element;
    }

    // ! Q4 Search Insert Position
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target <= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (start == end && nums[start] == target) {
            return start;
        }
        return start;
    }

    // ! Q5 Find Smallest Letter Greater Than Target
    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target >= letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return letters[start % letters.length];
    }

    // ! Q6 Find First and Last Position of Element in Sorted Array

    // * Helper function of Search Range
    static int findRange(int[] arr, int target, boolean isFirst) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return ans;
    }

    static int[] searchRange(int[] nums, int target) {

        int start = findRange(nums, target, true);
        int end = findRange(nums, target, false);

        return new int[] { start, end };
    }

    // ! Q7 Peak Element
    public int findPeakElement(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    // ! Q8 Rotated Sorted Array
    static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target <= nums[mid]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }

        }

        if (start == end && nums[start] == target) {
            return start;
        }

        return -1;
    }

    // ! Q9 Sqrt(x)
    static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int start = 1;
        int end = x / 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }

    public static void main(String[] args) {

        int[] arr = { 5, 7, 7, 8, 8, 10 };

        int[] result = searchRange(arr, 8);

        System.out.println(result[0] + "," + result[1]);
        // System.out.println(searchInsert(arr, 5));
        // System.out.println(nextGreatestLetter(arr, 'z'));
        // System.out.println(singleNumber(arr));
        // System.out.println(maxProfit(arr));
        // int res[] = twoSum(arr, 9);
        // System.out.println(res[0] + "," + res[1]);
    }
}