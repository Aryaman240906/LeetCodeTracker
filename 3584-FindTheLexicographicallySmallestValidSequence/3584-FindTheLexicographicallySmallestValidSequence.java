// Last updated: 11/08/2026, 20:14:17
class Solution {
    public int[] validSequence(String word1, String word2) {
        char[] s = word1.toCharArray();
        char[] t = word2.toCharArray();

        int n = s.length;
        int m = t.length;

        int[] suf = new int[n + 1];
        suf[n] = m;

        int j = m - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (j >= 0 && s[i] == t[j]) {
                j--;
            }
            suf[i] = j + 1;
        }

        int[] ans = new int[m];
        int i = 0;
        j = 0;
        boolean used = false;

        while (i < n && j < m) {

            if (s[i] == t[j]) {
                ans[j] = i;
                i++;
                j++;
            } else if (!used && suf[i + 1] <= j + 1) {
                used = true;
                ans[j] = i;
                i++;
                j++;
            } else {
                i++;
            }
        }

        if (j == m) {
            return ans;
        }

        return new int[0];
    }
}