// Last updated: 21/07/2026, 17:33:10
class Solution {
    public int countOdds(int low, int high) {
        int range = high - low + 1;
        int ans = range / 2;
        if (range % 2 == 1 && high % 2 == 1)
        ans++;

        return ans;
    }
}