// Last updated: 02/10/2026, 01:46:40
1import java.util.Stack;
2class Solution {
3    public boolean isValid(String s) {
4        Stack<Character> st = new Stack<>();
5        for (char c : s.toCharArray()) {
6            if (c == '(' || c == '[' || c == '{') {
7                st.push(c);
8            } else {
9                if (st.isEmpty()) {
10                    return false;
11                }
12                char top = st.pop();
13                if ((c == ')' && top != '(') ||
14                    (c == ']' && top != '[') ||
15                    (c == '}' && top != '{')) {
16                    return false;
17                }
18            }
19        }
20        return st.isEmpty();
21    }
22}