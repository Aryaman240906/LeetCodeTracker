// Last updated: 17/07/2026, 18:51:48
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int i = s.length() - 1;
4        int counter = 0;
5        while (i >= 0 && s.charAt(i) == ' ') {
6            i--;
7        }
8        while (i >= 0 && s.charAt(i) != ' ') {
9            counter++;
10            i--;
11        }
12        return counter;
13    }
14}