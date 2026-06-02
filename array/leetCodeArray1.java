public class leetCodeArray1 {
    public static void main(String[] args) {
        int missingValue = 0;
        int[] nums = { 0, 1 };
        int[] freq = new int[nums.length + 1];

        for (int i = 0; i < nums.length - 1; i++) {
            int digit = nums[i];
            freq[digit]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                missingValue = i;
            }
        }
        System.out.println(missingValue);
    }
}
