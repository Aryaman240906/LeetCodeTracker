// Last updated: 24/08/2026, 21:28:07
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        int i = 0;
4        int j = 0;
5
6        while (i < version1.length() || j < version2.length()) {
7            long revision1 = 0;
8            long revision2 = 0;
9
10            while (i < version1.length() && version1.charAt(i) != '.') {
11                revision1 = revision1 * 10 + (version1.charAt(i) - '0');
12                i++;
13            }
14
15            while (j < version2.length() && version2.charAt(j) != '.') {
16                revision2 = revision2 * 10 + (version2.charAt(j) - '0');
17                j++;
18            }
19
20            if (revision1 < revision2) {
21                return -1;
22            }
23
24            if (revision1 > revision2) {
25                return 1;
26            }
27
28            if (i < version1.length()) {
29                i++;
30            }
31
32            if (j < version2.length()) {
33                j++;
34            }
35        }
36
37        return 0;
38    }
39}