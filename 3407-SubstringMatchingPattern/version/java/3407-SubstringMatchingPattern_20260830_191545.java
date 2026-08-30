// Last updated: 30/08/2026, 19:15:45
1class Solution {
2    public boolean hasMatch(String s, String p) {
3        int star = p.indexOf('*');
4        String prefix = p.substring(0, star);
5        String suffix = p.substring(star + 1);
6        int start = s.indexOf(prefix);
7        if (start == -1) {
8            return false;
9        }
10        int end = start + prefix.length();
11        return s.indexOf(suffix, end) != -1;
12    }
13}