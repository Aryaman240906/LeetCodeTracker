// Last updated: 03/10/2026, 16:31:11
1import java.util.*;
2class Solution {
3    public int longestValidParentheses(String s) {
4        Deque<Integer> stack = new ArrayDeque<>();
5        stack.push(-1);
6        int maxLen = 0;
7        for (int i = 0; i < s.length(); i++) {
8            if (s.charAt(i) == '(') {
9                stack.push(i);
10            } else {
11                stack.pop();
12                if (stack.isEmpty()) {
13                    stack.push(i);
14                } else {
15                    maxLen = Math.max(maxLen, i - stack.peek());
16                }
17            }
18        }
19        return maxLen;
20    }
21}