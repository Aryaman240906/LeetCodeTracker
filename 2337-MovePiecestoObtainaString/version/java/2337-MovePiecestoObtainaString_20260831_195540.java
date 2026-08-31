// Last updated: 31/08/2026, 19:55:40
1class Solution {
2    public boolean canChange(String start, String target) {
3        int n = target.length();
4        int i = 0;
5        int j = 0;
6        while (i < n || j < n) {
7            while (i < n && start.charAt(i) == '_') {
8                i++;
9            }
10            while (j < n && target.charAt(j) == '_') {
11                j++;
12            }
13            if (i == n && j == n) {
14                return true;
15            }
16            if (i == n || j == n) {
17                return false;
18            }
19            if (start.charAt(i) != target.charAt(j)) {
20                return false;
21            }
22            if (start.charAt(i) == 'L') {
23                if (i < j) {
24                    return false;
25                }
26
27            } else {
28                if (i > j) {
29                    return false;
30                }
31            }
32            i++;
33            j++;
34        }
35        return true;
36    }
37}