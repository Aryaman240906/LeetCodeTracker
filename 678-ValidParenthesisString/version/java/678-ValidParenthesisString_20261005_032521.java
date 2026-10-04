// Last updated: 05/10/2026, 03:25:21
1class Solution {
2    public boolean checkValidString(String s) {
3        int low = 0;
4        int high = 0;
5        for (char c : s.toCharArray()) {
6
7            if (c == '(') {
8                low++;
9                high++;
10            } 
11            else if (c == ')') {
12                low--;
13                high--;
14            } 
15            else { 
16                low--;   
17                high++;  
18            }
19            low = Math.max(low, 0);
20            if (high < 0) {
21                return false;
22            }
23        }
24
25        return low == 0;
26    }
27}