// Last updated: 16/07/2026, 01:35:23
1class Solution {
2    public int removeDuplicates(int[] nums) {
3     if (nums.length == 0)
4            return 0;
5
6        int write = 1;
7
8        for (int read = 1; read < nums.length; read++) {
9            if (nums[read] != nums[write - 1]) {
10                nums[write] = nums[read];
11                write++;
12            }
13        }
14
15        return write;
16    }
17}