// Last updated: 17/07/2026, 20:19:25
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] ans = new int[2*n];
4        int k=0;
5        for(int i=0; i<n; i++){
6            ans[k++] = nums[i];
7            ans[k++] = nums[i+n];
8        }
9        return ans;
10    }
11}