// Last updated: 15/07/2026, 22:32:51
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3
4        Map<Integer, Integer> map = new HashMap<>(); // Value -> Index
5
6        for (int i = 0; i < nums.length; i++) {
7
8            int complement = target - nums[i];
9
10            // Search first
11            if (map.containsKey(complement)) {
12                return new int[]{map.get(complement), i};
13            }
14
15            // Store current value and index
16            map.put(nums[i], i);
17        }
18
19        return new int[]{};
20    }
21}