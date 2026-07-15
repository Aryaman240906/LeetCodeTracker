// Last updated: 15/07/2026, 22:43:51
1class Solution {
2    public int[] buildArray(int[] nums) {
3        int n = nums.length;
4        for(int i = 0; i < n; i++){
5            nums[i]+= (nums[nums[i]]%n)*n;
6        }
7        for(int j = 0; j<n; j++){
8            nums[j] /= n;
9        }
10        return nums;
11    }
12}