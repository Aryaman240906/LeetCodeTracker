// Last updated: 11/08/2026, 20:14:54
class Solution {

    private int[][] dp;
    private int[] suffix;
    private int n;

    public int stoneGameII(int[] piles) {
        n = piles.length;

        suffix = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        dp = new int[n][n + 1];

        return solve(0, 1);
    }

    private int solve(int index, int M) {
        if (index >= n)
            return 0;

        if (index + 2 * M >= n)
            return suffix[index];

        if (dp[index][M] != 0)
            return dp[index][M];

        int best = 0;

        for (int x = 1; x <= 2 * M; x++) {
            best = Math.max(best,
                    suffix[index] - solve(index + x, Math.max(M, x)));
        }

        return dp[index][M] = best;
    }
}