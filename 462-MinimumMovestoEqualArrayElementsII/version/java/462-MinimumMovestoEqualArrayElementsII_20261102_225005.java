// Last updated: 02/11/2026, 22:50:05
1import java.util.Arrays;
2
3class Solution {
4    public int minMoves2(int[] nums) {
5        // 1. Sort the array
6        Arrays.sort(nums);
7        // 2. Find the median
8        int n = nums.length;
9        int median = nums[n / 2];
10        // 3. Calculate total moves
11        long moves = 0;
12        for (int num : nums) {
13            moves += Math.abs((long) num - median);
14        }
15        // 4. Return result
16        return (int) moves;
17    }
18}