// Last updated: 30/08/2026, 19:13:19
1class Solution {
2    public boolean equalFrequency(String word) {
3        int[] freq = new int[26];
4        for (char c : word.toCharArray()) {
5            freq[c - 'a']++;
6        }
7        for (int i = 0; i < 26; i++) {
8
9            if (freq[i] == 0) {
10                continue;
11            }
12            freq[i]--;
13            int value = 0;
14            boolean equal = true;
15            for (int j = 0; j < 26; j++) {
16                if (freq[j] == 0) {
17                    continue;
18                }
19                if (value == 0) {
20                    value = freq[j];
21                } else if (freq[j] != value) {
22                    equal = false;
23                    break;
24                }
25            }
26            freq[i]++;
27            if (equal) {
28                return true;
29            }
30        }
31        return false;
32    }
33}