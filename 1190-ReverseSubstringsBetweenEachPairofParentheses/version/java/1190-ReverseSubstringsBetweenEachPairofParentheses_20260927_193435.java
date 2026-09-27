// Last updated: 27/09/2026, 19:34:35
1class Solution {
2    public String reverseParentheses(String s) {
3        Stack<String> stack = new Stack<>();
4        StringBuilder current = new StringBuilder();
5
6        for (char c : s.toCharArray()) {
7            if (c == '(') {
8                stack.push(current.toString());
9                current.setLength(0);
10            } else if (c == ')') {
11                current.reverse();
12                current.insert(0, stack.pop());
13            } else {
14                current.append(c);
15            }
16        }
17
18        return current.toString();
19    }
20}