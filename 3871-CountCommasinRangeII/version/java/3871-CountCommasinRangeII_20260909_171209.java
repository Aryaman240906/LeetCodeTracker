// Last updated: 09/09/2026, 17:12:09
1class Solution {
2    public long countCommas(long n) {
3        long ans = 0;
4        long start = 1000;
5        long commas = 1;
6
7        while (start <= n) {
8            long end = Math.min(n, start * 1000 - 1);
9            ans += (end - start + 1) * commas;
10
11            start *= 1000;
12            commas++;
13        }
14
15        return ans;
16    }
17}