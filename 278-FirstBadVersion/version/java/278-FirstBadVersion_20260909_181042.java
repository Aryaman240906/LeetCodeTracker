// Last updated: 09/09/2026, 18:10:42
1class Solution {
2    public int mySqrt(int x) {
3        long left = 0;
4        long right = x;
5        while(left<=right){
6            long mid = left+(right-left)/2;
7            if(mid*mid<=x){
8                left = mid+1;
9            }else{
10                right = mid-1;
11            }
12        }
13        return (int)right;
14    }
15}