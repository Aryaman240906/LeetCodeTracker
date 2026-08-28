// Last updated: 28/08/2026, 17:39:41
1class Solution {
2    private int solve(String s , int left , int right , int k){
3        int[] freq = new int[26];
4        if(right-left+1<k){
5            return 0;
6        }
7        for(int i = left; i <= right; i++){
8            freq[s.charAt(i) - 'a']++;
9        }
10        for(int i = left; i<=right; i++){
11            if(freq[s.charAt(i)-'a']<k){
12                int leftResult = solve(s,left,i-1,k);
13                int rightResult = solve(s,i+1,right,k);
14                return Math.max(leftResult,rightResult);
15            }
16        }
17        return right-left+1;
18    }
19    public int longestSubstring(String s, int k) {
20        return solve(s , 0, s.length()-1 , k);
21    }
22}