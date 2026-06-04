
public class MajorityElement {

    // ! brute force
    static int majorityElement(int nums[]) {

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > nums.length / 2) {
                return nums[i];
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = { 50, 50, 50, 20, 20, 20 };
        if (majorityElement(nums) == 0) {
            System.out.println("No majority found");
        } else {
            System.out.println(majorityElement(nums));
        }

    }

}