// Last updated: 24/09/2026, 03:02:23
1class Solution {
2    public int minOperations(int[] nums, int x) {
3        int n = nums.length;
4
5        long total = 0;
6
7        for (int num : nums) {
8            total += num;
9        }
10
11        long target = total - x;
12
13        if (target < 0) {
14            return -1;
15        }
16
17        if (target == 0) {
18            return n;
19        }
20
21        int left = 0;
22        int maxLen = -1;
23        long sum = 0;
24
25        for (int right = 0; right < n; right++) {
26            sum += nums[right];
27
28            while (sum > target && left <= right) {
29                sum -= nums[left];
30                left++;
31            }
32
33            if (sum == target) {
34                maxLen = Math.max(maxLen, right - left + 1);
35            }
36        }
37
38        return maxLen == -1 ? -1 : n - maxLen;
39    }
40}