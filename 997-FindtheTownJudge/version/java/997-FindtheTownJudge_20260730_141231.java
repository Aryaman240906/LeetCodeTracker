// Last updated: 30/07/2026, 14:12:31
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        if(n==1)return 1;
4        int[] score = new int[n+1];
5        for(int[] pair : trust){
6            int a = pair[0];
7            int b = pair[1];
8            score[a]--;
9            score[b]++;
10        }
11        for(int i=1; i<=n; i++){
12            if(score[i]==n-1)return i;
13        }
14        return -1;
15    }
16}