// Last updated: 24/07/2026, 14:45:58
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] freq = new int[26];
4        for(char c : s.toCharArray()){
5            freq[c-'a']++;
6        }
7        for(int i=0;i<s.length();i++){
8
9            if(freq[s.charAt(i)-'a']==1){
10                return i;
11            }
12        }
13        return -1;
14    }
15}