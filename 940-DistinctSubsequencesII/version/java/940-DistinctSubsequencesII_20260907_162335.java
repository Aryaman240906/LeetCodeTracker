// Last updated: 07/09/2026, 16:23:35
1class Solution {
2    public int distinctSubseqII(String s) {
3        long MOD = 1000000007;
4
5        long dp = 1;
6        long[] last = new long[26];
7
8        for (char c : s.toCharArray()) {
9            int index = c - 'a';
10
11            long newDp = (2 * dp - last[index] + MOD) % MOD;
12
13            last[index] = dp;
14            dp = newDp;
15        }
16
17        return (int)((dp - 1 + MOD) % MOD);
18    }
19}