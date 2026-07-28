// Last updated: 28/07/2026, 23:16:06
class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        int[] freq = new int[26];
        for (char c : chars.toCharArray()) {
            freq[c - 'a']++;
        }
        for (String word : words) {
            int[] available = freq.clone();
            boolean isGood = true;
            for (char c : word.toCharArray()) {
                if (available[c - 'a'] == 0) {
                    isGood = false;
                    break;
                }
                available[c - 'a']--;
            }
            if (isGood) {
                sum += word.length();
            }
        }
        return sum;
    }
}