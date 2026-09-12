// Last updated: 12/09/2026, 17:49:25
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5        while (left <= right) {
6            int mid = left + (right - left)/2;
7            if (nums[mid] == target) {
8                return true;
9            }
10            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
11                left++;
12                right--;
13            }
14            else if (nums[left] <= nums[mid]) {
15                if (nums[left] <= target && target < nums[mid]) {
16                    right = mid - 1;
17                } else {
18                    left = mid + 1;
19                }
20            }
21            else {
22                if (nums[mid] < target && target <= nums[right]) {
23                    left = mid + 1;
24                } else {
25                    right = mid - 1;
26                }
27            }
28        }
29        return false;
30    }
31}