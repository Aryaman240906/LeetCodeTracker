// Last updated: 12/09/2026, 17:42:24
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5        while (left <= right) {
6            int mid = left + (right - left) / 2;
7            if (nums[mid] == target) {
8                return mid;
9            }
10            if (nums[left] <= nums[mid]) {
11                if (nums[left] <= target && target < nums[mid]) {
12                    right = mid - 1;
13                } else {
14                    left = mid + 1;
15                }
16            } else {
17                if (nums[mid] < target && target <= nums[right]) {
18                    left = mid + 1;
19                } else {
20                    right = mid - 1;
21                }
22            }
23        }
24        return -1;
25    }
26}