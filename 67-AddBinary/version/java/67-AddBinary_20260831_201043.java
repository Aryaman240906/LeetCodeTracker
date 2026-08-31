// Last updated: 31/08/2026, 20:10:43
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder ans = new StringBuilder();
4        int carry = 0;
5        int i = a.length()-1;
6        int j = b.length()-1;
7        while(i>=0 || j>=0 || carry>0){
8            int sum = carry;
9            if(i>=0){
10                sum+=a.charAt(i)-'0';
11                i--;
12            }
13            if(j>=0){
14                sum+=b.charAt(j)-'0';
15                j--;
16            }
17            ans.append(sum%2);
18            carry = sum/2;
19        }
20        return ans.reverse().toString();
21    }
22}