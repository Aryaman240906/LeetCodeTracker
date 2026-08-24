// Last updated: 24/08/2026, 19:06:39
1class Solution {
2    public int myAtoi(String s) {
3        int i = 0;
4        int n = s.length();
5        int sign = 1;
6
7        while (i < n && s.charAt(i) == ' ') {
8            i++;
9        }
10
11        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
12            if (s.charAt(i) == '-') {
13                sign = -1;
14            }
15            i++;
16        }
17
18        while (i < n && s.charAt(i) == '0') {
19            i++;
20        }
21
22        long result = 0;
23
24        while (i < n && Character.isDigit(s.charAt(i))) {
25            result = result * 10 + (s.charAt(i) - '0');
26
27            if (sign == 1 && result > Integer.MAX_VALUE) {
28                return Integer.MAX_VALUE;
29            }
30
31            if (sign == -1 && -result < Integer.MIN_VALUE) {
32                return Integer.MIN_VALUE;
33            }
34
35            i++;
36        }
37
38        return (int) (sign * result);
39    }
40}