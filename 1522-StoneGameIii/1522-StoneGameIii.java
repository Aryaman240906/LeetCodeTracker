// Last updated: 07/08/2026, 18:52:29
class Solution {

    Integer[] dp;

    public String stoneGameIII(int[] stoneValue) {

        int n = stoneValue.length;
        dp = new Integer[n];

        int diff = solve(stoneValue, 0);

        if (diff > 0) return "Alice";
        if (diff < 0) return "Bob";
        return "Tie";
    }

    private int solve(int[] stone, int i) {

        if (i >= stone.length)
            return 0;

        if (dp[i] != null)
            return dp[i];

        int ans = Integer.MIN_VALUE;
        int sum = 0;

        for (int k = 0; k < 3 && i + k < stone.length; k++) {
            sum += stone[i + k];
            ans = Math.max(ans, sum - solve(stone, i + k + 1));
        }

        return dp[i] = ans;
    }
}