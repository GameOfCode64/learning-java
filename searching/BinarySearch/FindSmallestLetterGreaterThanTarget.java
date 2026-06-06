public class FindSmallestLetterGreaterThanTarget {
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return letters[start % letters.length];
    }

    public static void main(String[] argu) {
        char[] arr = { 'x', 'x', 'y', 'y' };
        char target = 'z';

        char result = nextGreatestLetter(arr, target);
        System.out.println(result);
    }
}