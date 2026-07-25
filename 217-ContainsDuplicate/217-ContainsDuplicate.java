// Last updated: 25/07/2026, 23:45:54
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        if (n < 2) return false;
        HashSet<Integer> set = new HashSet<>(n * 2);
        for (int i = 0; i < n; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}