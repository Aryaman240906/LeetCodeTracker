// Last updated: 18/07/2026, 23:59:04
class Solution {
    public int[] findErrorNums(int[] nums) {

        int n = nums.length;
        int[] freq = new int[n + 1];

        for (int num : nums) {
            freq[num]++;
        }

        int[] ans = new int[2];

        for (int i = 1; i <= n; i++) {

            if (freq[i] == 2)
                ans[0] = i;

            if (freq[i] == 0)
                ans[1] = i;
        }

        return ans;
    }
}