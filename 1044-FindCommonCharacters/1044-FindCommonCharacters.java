// Last updated: 07/08/2026, 18:52:54
class Solution {
    public List<String> commonChars(String[] words) {
        int[] commonFreq = new int[26];
        for (char c : words[0].toCharArray()) {
            commonFreq[c - 'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] currFreq = new int[26];
            for (char c : words[i].toCharArray()) {
                currFreq[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                commonFreq[j] = Math.min(commonFreq[j], currFreq[j]);
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (commonFreq[i] > 0) {
                ans.add(String.valueOf((char) ('a' + i)));
                commonFreq[i]--;
            }
        }
        return ans;
    }
}