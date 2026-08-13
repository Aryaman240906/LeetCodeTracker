// Last updated: 13/08/2026, 18:21:06
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> ans = new ArrayList<>();
4        int windowSize = p.length();
5        int[] reqFreq = new int[26];
6        int[] winFreq = new int[26];
7        int left = 0;
8        for (char c : p.toCharArray()) {
9            reqFreq[c - 'a']++;
10        }
11        int matched = 0;
12        int required = 0;
13        for (int i = 0; i < 26; i++) {
14            if (reqFreq[i] > 0) {
15                required++;
16            }
17        }
18        for (int right = 0; right < s.length(); right++) {
19            int r = s.charAt(right) - 'a';
20            winFreq[r]++;
21            if (winFreq[r] == reqFreq[r]) {
22                matched++;
23            }
24            if (right - left + 1 == windowSize) {
25                if (matched == required) {
26                    ans.add(left);
27                }
28                int l = s.charAt(left) - 'a';
29                if (winFreq[l] == reqFreq[l]) {
30                    matched--;
31                }
32                winFreq[l]--;
33                left++;
34            }
35        }
36        return ans;
37    }
38}