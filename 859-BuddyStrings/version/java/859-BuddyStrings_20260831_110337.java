// Last updated: 31/08/2026, 11:03:37
1class Solution {
2    public boolean buddyStrings(String s, String goal) {
3        if (s.length() != goal.length()) {
4            return false;
5        }
6        if (s.equals(goal)) {
7            int[] freq = new int[26];
8            for (char c : s.toCharArray()) {
9                freq[c - 'a']++;
10                if (freq[c - 'a'] >= 2) {
11                    return true;
12                }
13            }
14            return false;
15        }
16        int[] freqS = new int[26];
17        int[] freqG = new int[26];
18
19        for (char c : s.toCharArray()) {
20            freqS[c - 'a']++;
21        }
22        for (char c : goal.toCharArray()) {
23            freqG[c - 'a']++;
24        }
25        for (int i = 0; i < 26; i++) {
26            if (freqS[i] != freqG[i]) {
27                return false;
28            }
29        }
30        int mismatchCount = 0;
31        for (int i = 0; i < s.length(); i++) {
32            if (s.charAt(i) != goal.charAt(i)) {
33                mismatchCount++;
34            }
35        }
36        return mismatchCount == 2;
37    }
38}