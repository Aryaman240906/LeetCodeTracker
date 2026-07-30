// Last updated: 30/07/2026, 16:57:34
1class Solution {
2    public boolean isHappy(int n) {
3        HashSet<Integer> seen = new HashSet<>();
4        while( n!=1){
5            if(seen.contains(n)){
6                return false;
7            }
8            seen.add(n);
9            n=getNext(n);
10        }
11        return true;
12    }
13    private int getNext(int n){
14        int sum = 0;
15        while(n>0){
16            int digit= n % 10;
17            sum+= digit*digit;
18            n/= 10;
19        }
20        return sum;
21    }
22}