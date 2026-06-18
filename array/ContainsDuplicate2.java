import java.util.HashMap;

public class ContainsDuplicate2 {

    static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] argu) {
        int[] nums = { 1, 2, 3, 1, 2, 3 };
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));

    }
}
