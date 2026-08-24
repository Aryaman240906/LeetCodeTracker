// Last updated: 24/08/2026, 20:29:11
1class Solution {
2    public boolean isNumber(String s) {
3        boolean digitSeen = false;
4        boolean digitAfterExponent = true;
5        boolean exponentSeen = false;
6        boolean decimalSeen = false;
7
8        for (int i = 0; i < s.length(); i++) {
9            char c = s.charAt(i);
10
11            if (Character.isDigit(c)) {
12                digitSeen = true;
13
14                if (exponentSeen) {
15                    digitAfterExponent = true;
16                }
17            } 
18            else if (c == '+' || c == '-') {
19                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
20                    return false;
21                }
22            } 
23            else if (c == '.') {
24                if (decimalSeen || exponentSeen) {
25                    return false;
26                }
27
28                decimalSeen = true;
29            } 
30            else if (c == 'e' || c == 'E') {
31                if (exponentSeen || !digitSeen) {
32                    return false;
33                }
34
35                exponentSeen = true;
36                digitAfterExponent = false;
37            } 
38            else {
39                return false;
40            }
41        }
42
43        return digitSeen && digitAfterExponent;
44    }
45}