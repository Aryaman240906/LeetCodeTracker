// Last updated: 16/07/2026, 22:55:02
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int max = 0;
4        int counter = 0;
5        
6        for (int i = 0; i < nums.length; i++) {
7            if (nums[i] == 1) {
8                counter++;
9                max = Math.max(max, counter); 
10            } else {
11                counter = 0; 
12            }
13        }
14        return max;
15    }
16}