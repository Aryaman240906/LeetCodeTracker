// Last updated: 17/07/2026, 18:09:46
1class Solution {
2    public void reverseString(char[] s) {
3        int n = s.length;
4        reverse(s ,0 ,n-1);
5    }
6    private void reverse(char[] s, int left , int right){
7        while(left<right){
8            char temp = s[left];
9            s[left] = s[right];
10            s[right] = temp;
11            left++;
12            right--;
13        }
14    }
15}