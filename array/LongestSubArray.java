import java.util.*;
public class LongestSubArray {
    
    public static int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = 0;
        for(int i = 0; i < nums.length; i++){

            while(k > map.getOrDefault(nums[i], 0)){
                if (map.containsKey(nums[i])) {
                    map.computeIfPresent(nums[i], (key, oldValue) -> oldValue + 1);
                } else {
                    map.put(nums[i], 1);
                }
                length++;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        int[] nums = {1,1000000000};
        int k = 2;
        System.out.println(maxSubarrayLength(nums, k));
    }
}