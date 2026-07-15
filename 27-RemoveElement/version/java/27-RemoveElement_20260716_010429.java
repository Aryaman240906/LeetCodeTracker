// Last updated: 16/07/2026, 01:04:29
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int write = 0;
4        for(int read =0 ; read<nums.length; read++){
5            if(nums[read] != val){
6                nums[write] = nums[read];
7                write++;
8            }
9        }
10        return write;
11    }
12}