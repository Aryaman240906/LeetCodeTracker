// Last updated: 23/07/2026, 19:59:13
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) {
4            return false;
5        }
6        char[] sArray = s.toCharArray();
7        char[] tArray = t.toCharArray();
8        Arrays.sort(sArray);
9        Arrays.sort(tArray);
10        return Arrays.equals(sArray, tArray);
11    }
12}