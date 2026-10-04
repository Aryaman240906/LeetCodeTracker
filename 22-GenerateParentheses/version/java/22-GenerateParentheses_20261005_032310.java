// Last updated: 05/10/2026, 03:23:10
1import java.util.*;
2class Solution {
3    public List<String> generateParenthesis(int n) {
4        List<String> ans = new ArrayList<>();
5        StringBuilder current = new StringBuilder();
6        backtrack(n, 0, 0, current, ans);
7        return ans;
8    }
9    private void backtrack(
10            int n,
11            int open,
12            int close,
13            StringBuilder current,
14            List<String> ans
15    ) {
16        if (current.length() == 2 * n) {
17            ans.add(current.toString());
18            return;
19        }
20        if (open < n) {
21            current.append('(');
22
23            backtrack(n, open + 1, close, current, ans);
24
25            current.deleteCharAt(current.length() - 1);
26        }
27        if (close < open) {
28            current.append(')');
29            backtrack(n, open, close + 1, current, ans);
30            current.deleteCharAt(current.length() - 1);
31        }
32    }
33}