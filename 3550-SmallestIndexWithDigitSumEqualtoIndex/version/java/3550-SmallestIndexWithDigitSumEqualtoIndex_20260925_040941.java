// Last updated: 25/09/2026, 04:09:41
1class Solution {
2    public int smallestIndex(int[] nums) {
3        for (int i = 0; i < nums.length; i++) {
4            int x = nums[i];
5            int sum = 0;
6
7            while (x > 0) {
8                sum += x % 10;
9                x /= 10;
10            }
11
12            if (sum == i) {
13                return i;
14            }
15        }
16
17        return -1;
18    }
19}