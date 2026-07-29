// Last updated: 29/07/2026, 17:03:28
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        String first = strs[0];
4        for(int i=0; i<first.length(); i++){
5            char ch = first.charAt(i);
6            for(int j=1; j<strs.length; j++){
7                if(i>=strs[j].length() || strs[j].charAt(i) != ch){
8                    return first.substring(0,i);
9                }
10            }
11        }
12        return first;
13    }
14}