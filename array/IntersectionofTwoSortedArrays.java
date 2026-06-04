public class IntersectionofTwoSortedArrays {
    // ! Intersection of Two Sorted Arrays
    // * */ arr1 = {1,2,3,4,5}
    // * */ arr2 = {2,4,6}
    // * */ Output -> 2,4

    static int[] checkIntersection(int arr1[], int arr2[]) {
        int[] intersection = new int[arr1.length + arr2.length];
        int left = 0;
        int right = 0;
        int writePtr = 0;

        int val = 0;

        while (left < arr1.length && right < arr2.length) {
            if (arr1[left] < arr2[right]) {
                left++;
            } else if (arr1[left] > arr2[right]) {
                right++;
            } else {
                val = arr1[left];
                if (writePtr == 0 || intersection[writePtr - 1] != val) {
                    intersection[writePtr] = val;
                    writePtr++;
                }
                left++;
                right++;
            }

        }

        return intersection;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 4 };
        int[] arr2 = { 2, 2, 5 };

        // arr1 = {1,2,2,4}
        // arr2 = {2,2,5};

        int[] result = checkIntersection(arr1, arr2);

        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0) {
                System.out.print(result[i] + ",");
            }
        }
    }
}
