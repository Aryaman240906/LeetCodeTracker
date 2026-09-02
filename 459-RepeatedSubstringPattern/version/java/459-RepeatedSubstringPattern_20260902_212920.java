// Last updated: 02/09/2026, 21:29:20
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        int n = s.length();
4        for(int l=n/2; l>=1; l--){
5            if(n%l==0){
6                int times = n/l;
7                String pattern = s.substring(0,l);
8                StringBuilder newStr = new StringBuilder();
9                while(times>0){
10                    times--;
11                    newStr.append(pattern);
12                }
13                if(newStr.toString().equals(s)){
14                    return true;
15                }
16            }
17        }
18        return false;
19    }
20}