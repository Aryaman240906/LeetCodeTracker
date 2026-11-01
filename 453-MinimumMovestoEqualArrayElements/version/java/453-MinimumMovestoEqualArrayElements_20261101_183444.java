// Last updated: 01/11/2026, 18:34:44
1class Solution {
2    public int minMoves(int[] nums) {
3        int min = Integer.MAX_VALUE;
4        for(int num : nums){
5            if(num<min){
6                min = num;
7            }
8        }
9        int minMoves = 0;
10        for(int num : nums){
11            minMoves += (num-min);
12        }
13        return minMoves;
14    }
15}