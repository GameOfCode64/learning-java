class Solution {

    public boolean uniformArray(int[] nums1) {
        if (nums1.length <= 1) {
            return true;
        }

       
        int minOdd = Integer.MAX_VALUE;
        for (int num : nums1) {
            if (num % 2 != 0) { 
                if (num < minOdd) {
                    minOdd = num;
                }
            }
        }

        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }

        for (int num : nums1) {
            if (num % 2 == 0) {
                if (num <= minOdd) {
                    return false;
                }
            }
        }

        return true;
    }
}