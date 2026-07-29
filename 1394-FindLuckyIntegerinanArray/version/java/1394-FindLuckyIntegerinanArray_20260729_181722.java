// Last updated: 29/07/2026, 18:17:22
1class Solution {
2    public int findLucky(int[] arr) {
3        int[] freq = new int[501];
4        for (int num : arr) {
5            freq[num]++;
6        }
7        for (int i = 500; i >= 1; i--) {
8            if (freq[i] == i) {
9                return i;
10            }
11        }
12        return -1;
13    }
14}