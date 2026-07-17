// Last updated: 17/07/2026, 19:47:17
1class Solution {
2    public void moveZeroes(int[] nums) {
3
4        int n = nums.length;
5
6        int i = 0;
7        for(int x : nums) {
8            if(x !=0 ) {
9                nums[i] = x;
10                i++;
11            }
12        }
13
14        while(i < n){
15            nums[i++] =0;
16        }
17        
18    }
19}