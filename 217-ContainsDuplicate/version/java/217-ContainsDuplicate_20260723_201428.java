// Last updated: 23/07/2026, 20:14:28
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        int n = nums.length;
4        if (n < 2) return false;
5        HashSet<Integer> set = new HashSet<>(n * 2);
6        for (int i = 0; i < n; i++) {
7            if (!set.add(nums[i])) {
8                return true;
9            }
10        }
11        return false;
12    }
13}