// Last updated: 14/09/2026, 17:46:05
1class Solution {
2    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
3        if (rec1[2] <= rec2[0] || rec2[2] <= rec1[0]) {
4            return false;
5        }
6
7        if (rec1[3] <= rec2[1] || rec2[3] <= rec1[1]) {
8            return false;
9        }
10
11        return true;
12    }
13}