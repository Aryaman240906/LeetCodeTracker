// Last updated: 19/09/2026, 01:13:44
1 class Solution {
2    public List<String> maxNumOfSubstrings(String s) {
3        int n = s.length();
4
5        int[] first = new int[26];
6        int[] last = new int[26];
7
8        Arrays.fill(first, n);
9
10        for (int i = 0; i < n; i++) {
11            int c = s.charAt(i) - 'a';
12            first[c] = Math.min(first[c], i);
13            last[c] = i;
14        }
15
16        List<int[]> intervals = new ArrayList<>();
17
18        for (int c = 0; c < 26; c++) {
19            if (first[c] == n) {
20                continue;
21            }
22
23            int l = first[c];
24            int r = last[c];
25            boolean valid = true;
26
27            for (int i = l; i <= r; i++) {
28                int x = s.charAt(i) - 'a';
29
30                if (first[x] < l) {
31                    valid = false;
32                    break;
33                }
34
35                r = Math.max(r, last[x]);
36            }
37
38            if (valid) {
39                intervals.add(new int[]{l, r});
40            }
41        }
42
43        intervals.sort((a, b) -> Integer.compare(a[1], b[1]));
44
45        List<String> ans = new ArrayList<>();
46        int lastEnd = -1;
47
48        for (int[] interval : intervals) {
49            int l = interval[0];
50            int r = interval[1];
51
52            if (l > lastEnd) {
53                ans.add(s.substring(l, r + 1));
54                lastEnd = r;
55            }
56        }
57
58        return ans;
59    }
60}