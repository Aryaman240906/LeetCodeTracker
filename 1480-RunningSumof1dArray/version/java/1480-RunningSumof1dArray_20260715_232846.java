// Last updated: 15/07/2026, 23:28:46
1class Solution {
2    public int[] runningSum(int[] nums) {
3        int n = nums.length;
4        int[] runningSum = new int[n];
5        runningSum[0] = nums[0];
6        for(int i = 1; i<n ; i++){
7            runningSum[i] = nums[i] + runningSum[i-1];
8        }
9        return runningSum;
10    }
11}