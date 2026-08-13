// Last updated: 13/08/2026, 15:51:56
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int currentSUM = 0;
4        int maxSUM = Integer.MIN_VALUE ;
5        int left = 0;
6        for(int right=0; right<nums.length; right++){
7            currentSUM += nums[right];
8            if(right-left+1==k){
9                maxSUM = Math.max(maxSUM,currentSUM);
10                currentSUM -= nums[left];
11                left++;
12            }
13        }
14        return (double)maxSUM/k;
15    }
16}