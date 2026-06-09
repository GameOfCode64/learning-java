public class MedianofTwoSortedArrays {
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        if (result.length == 0) {
            return 0.0;
        }

        int left = 0;
        int right = 0;
        int count = 0;

        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] > nums2[right]) {
                result[count++] = nums2[right++];
            } else {
                result[count++] = nums1[left++];
            }
        }

        while (left < nums1.length) {
            result[count++] = nums1[left++];
        }

        while (right < nums2.length) {
            result[count++] = nums2[right++];
        }

        int mid = result.length / 2;

        if (result.length % 2 != 0) {
            return (double) result[mid];
        } else {
            return (result[mid] + result[mid - 1]) / 2.0;
        }

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3 };
        int[] arr2 = { 2 };
        double result = findMedianSortedArrays(arr1, arr2);
        System.out.println(result);
    }
}
