// Last updated: 13/08/2026, 15:09:51
class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int i = 1;
        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }
        HashSet<Integer> present = new HashSet<>();
        for (int num : nums) {
            present.add(num);
        }
        int candidate = sum;
        while (present.contains(candidate)) {
            candidate++;
        }
        return candidate;
    }
}