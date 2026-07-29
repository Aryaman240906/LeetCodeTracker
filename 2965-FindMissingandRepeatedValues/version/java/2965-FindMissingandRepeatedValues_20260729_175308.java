// Last updated: 29/07/2026, 17:53:08
1class Solution {
2    public int[] findMissingAndRepeatedValues(int[][] grid) {
3        int n = grid.length;
4        int[] ans = new int[2];
5        int[] freq = new int[n*n+1];
6        for(int[] arr : grid){
7            for(int num : arr){
8                freq[num]++;
9            }
10        }
11        for(int i =1; i<=n*n; i++){
12            if(freq[i]==2){
13                ans[0] = i;
14            }
15            if(freq[i]==0){
16                ans[1] = i;
17            }
18        }
19        return ans;
20    }
21}