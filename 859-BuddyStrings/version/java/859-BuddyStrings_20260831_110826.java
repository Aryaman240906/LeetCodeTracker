// Last updated: 31/08/2026, 11:08:26
1class Solution {
2    public boolean buddyStrings(String s, String goal) {
3        if (s.length() != goal.length()) {
4            return false;
5        }
6        if (s.equals(goal)) {
7            boolean[] seen = new boolean[26];
8            for (char c : s.toCharArray()) {
9                if (seen[c - 'a']) {
10                    return true;
11                }
12                seen[c - 'a'] = true;
13            }
14            return false;
15        }
16        int firstMismatch = -1;
17        int secondMismatch = -1;
18
19        for (int i = 0; i < s.length(); i++) {
20
21            if (s.charAt(i) != goal.charAt(i)) {
22
23                if (firstMismatch == -1) {
24                    firstMismatch = i;
25                } 
26                else if (secondMismatch == -1) {
27                    secondMismatch = i;
28                } 
29                else {
30                    return false;
31                }
32            }
33        }
34        if (firstMismatch == -1 || secondMismatch == -1) {
35            return false;
36        }
37        return s.charAt(firstMismatch) == goal.charAt(secondMismatch)
38            && s.charAt(secondMismatch) == goal.charAt(firstMismatch);
39    }
40}