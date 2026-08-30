// Last updated: 30/08/2026, 18:55:59
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        return s.length() == goal.length() && (s + s).contains(goal);
4    }
5}