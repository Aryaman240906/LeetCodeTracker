// Last updated: 21/07/2026, 17:33:36
class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int expectedSum = (n * (n + 1)) / 2;

        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}