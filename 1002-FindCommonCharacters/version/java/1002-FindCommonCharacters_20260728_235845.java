// Last updated: 28/07/2026, 23:58:45
1class Solution {
2    public List<String> commonChars(String[] words) {
3        int[] commonFreq = new int[26];
4        for (char c : words[0].toCharArray()) {
5            commonFreq[c - 'a']++;
6        }
7        for (int i = 1; i < words.length; i++) {
8            int[] currFreq = new int[26];
9            for (char c : words[i].toCharArray()) {
10                currFreq[c - 'a']++;
11            }
12            for (int j = 0; j < 26; j++) {
13                commonFreq[j] = Math.min(commonFreq[j], currFreq[j]);
14            }
15        }
16        List<String> ans = new ArrayList<>();
17        for (int i = 0; i < 26; i++) {
18            while (commonFreq[i] > 0) {
19                ans.add(String.valueOf((char) ('a' + i)));
20                commonFreq[i]--;
21            }
22        }
23        return ans;
24    }
25}