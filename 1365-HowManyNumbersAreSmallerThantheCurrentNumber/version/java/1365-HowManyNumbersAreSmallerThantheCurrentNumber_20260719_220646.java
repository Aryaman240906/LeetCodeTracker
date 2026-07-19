// Last updated: 19/07/2026, 22:06:46
1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3
4        int[] freq = new int[101];
5        for (int num : nums) {
6            freq[num]++;
7        }
8        for (int i = 1; i < 101; i++) {
9            freq[i] += freq[i - 1];
10        }
11        int[] ans = new int[nums.length];
12
13        for (int i = 0; i < nums.length; i++) {
14
15            if (nums[i] == 0) {
16                ans[i] = 0;
17            } else {
18                ans[i] = freq[nums[i] - 1];
19            }
20        }
21        return ans;
22    }
23}