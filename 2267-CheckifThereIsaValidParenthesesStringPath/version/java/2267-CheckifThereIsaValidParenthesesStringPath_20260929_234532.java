// Last updated: 29/09/2026, 23:45:32
1class Solution {
2    public boolean hasValidPath(char[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int len = m + n - 1;
6
7        if (len % 2 == 1) return false;
8        if (grid[0][0] == ')') return false;
9        if (grid[m - 1][n - 1] == '(') return false;
10
11        boolean[][][] dp = new boolean[m][n][len + 1];
12
13        dp[0][0][1] = true;
14
15        for (int i = 0; i < m; i++) {
16            for (int j = 0; j < n; j++) {
17                if (i == 0 && j == 0) continue;
18
19                for (int balance = 0; balance <= len; balance++) {
20                    int prevBalance;
21
22                    if (grid[i][j] == '(') {
23                        prevBalance = balance - 1;
24                    } else {
25                        prevBalance = balance + 1;
26                    }
27
28                    if (prevBalance < 0 || prevBalance > len) continue;
29
30                    if (i > 0 && dp[i - 1][j][prevBalance]) {
31                        dp[i][j][balance] = true;
32                    }
33
34                    if (j > 0 && dp[i][j - 1][prevBalance]) {
35                        dp[i][j][balance] = true;
36                    }
37                }
38            }
39        }
40
41        return dp[m - 1][n - 1][0];
42    }
43}