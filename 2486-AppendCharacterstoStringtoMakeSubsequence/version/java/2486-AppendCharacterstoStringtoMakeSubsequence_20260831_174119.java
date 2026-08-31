// Last updated: 31/08/2026, 17:41:19
1class Solution {
2    public int appendCharacters(String s, String t) {
3        int i = 0;
4        int j = 0;
5        while(i<s.length() && j<t.length()){
6            if(s.charAt(i)==t.charAt(j)){
7                j++;
8            }
9            i++;
10        }
11        return t.length()-j;
12    }
13}