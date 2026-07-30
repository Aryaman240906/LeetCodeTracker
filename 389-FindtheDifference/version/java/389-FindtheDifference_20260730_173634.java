// Last updated: 30/07/2026, 17:36:34
1class Solution { 
2    public char findTheDifference(String s, String t) { 
3        char ans = 0; 
4        for (char c : s.toCharArray()) { 
5            ans ^= c; 
6        } 
7        for (char c : t.toCharArray()) { 
8            ans ^= c; 
9        } 
10        return ans; 
11    } 
12}