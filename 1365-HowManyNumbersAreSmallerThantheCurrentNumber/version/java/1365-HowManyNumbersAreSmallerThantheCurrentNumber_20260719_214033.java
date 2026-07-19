// Last updated: 19/07/2026, 21:40:33
1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        int counter=0;
6        for(int i=0; i<n; i++){
7            for(int j=0; j<n; j++){
8                if(j!=i && nums[i] > nums[j]){
9                counter++;
10                }
11            }
12            ans[i] = counter;
13            counter=0;
14        }
15        return ans;
16    }
17}