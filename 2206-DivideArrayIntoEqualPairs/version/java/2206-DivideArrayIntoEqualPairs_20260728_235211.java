// Last updated: 28/07/2026, 23:52:11
1class Solution {
2    public boolean divideArray(int[] nums) {
3        int[] freq = new int[501];
4        for (int num : nums) {
5            freq[num]++;
6        }
7        for (int i = 1; i < freq.length; i++) {
8            if (freq[i] % 2 != 0) {
9                return false;
10            }
11        }
12        return true;
13    }
14}