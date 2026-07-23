// Last updated: 23/07/2026, 19:55:29
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        char[] str1 = s.toCharArray();
4        char[] str2 = t.toCharArray();
5        Arrays.sort(str1);
6        Arrays.sort(str2);
7        String key1 = new String(str1);
8        String key2 = new String(str2);
9        return key1.equals(key2);
10    }
11}