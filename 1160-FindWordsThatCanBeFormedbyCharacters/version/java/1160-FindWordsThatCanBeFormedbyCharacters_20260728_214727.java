// Last updated: 28/07/2026, 21:47:27
1class Solution {
2    public int countCharacters(String[] words, String chars) {
3        int sum = 0;
4        int[] freq = new int[26];
5        for (char c : chars.toCharArray()) {
6            freq[c - 'a']++;
7        }
8        for (String word : words) {
9            int[] available = freq.clone();
10            boolean isGood = true;
11            for (char c : word.toCharArray()) {
12                if (available[c - 'a'] == 0) {
13                    isGood = false;
14                    break;
15                }
16                available[c - 'a']--;
17            }
18            if (isGood) {
19                sum += word.length();
20            }
21        }
22        return sum;
23    }
24}