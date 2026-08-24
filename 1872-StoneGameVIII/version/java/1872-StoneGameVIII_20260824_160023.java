// Last updated: 24/08/2026, 16:00:23
1class Solution {
2    public int stoneGameVIII(int[] stones) {
3
4        int n = stones.length;
5
6        long[] prefix = new long[n];
7
8        prefix[0] = stones[0];
9
10        for (int i = 1; i < n; i++) {
11            prefix[i] = prefix[i - 1] + stones[i];
12        }
13
14        long dp = prefix[n - 1];
15
16        for (int i = n - 2; i >= 1; i--) {
17            dp = Math.max(dp, prefix[i] - dp);
18        }
19
20        return (int) dp;
21    }
22}