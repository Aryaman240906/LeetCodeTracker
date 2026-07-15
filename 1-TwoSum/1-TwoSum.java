// Last updated: 15/07/2026, 22:34:28
class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>(); // Value -> Index

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            // Search first
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store current value and index
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}