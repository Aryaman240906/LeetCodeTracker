// Last updated: 22/07/2026, 20:37:26
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n = nums.length;
4        int i = 0;
5        while (i < n) {
6            int correctIndex = nums[i] - 1;
7
8            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correctIndex]) {
9                int temp = nums[i];
10                nums[i] = nums[correctIndex];
11                nums[correctIndex] = temp;
12            } else {
13                i++;
14            }
15        }
16        for (i = 0; i < n; i++) {
17            if (nums[i] != i + 1) {
18                return i + 1;
19            }
20        }
21        return n + 1;
22    }
23}