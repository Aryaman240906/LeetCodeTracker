// Last updated: 17/07/2026, 18:29:09
1class Solution {
2    public boolean isPalindrome(String s) {
3       int left=0;
4       int right=s.length()-1; 
5       while(left<right){
6        while(left<right && !Character.isLetterOrDigit(s.charAt(left)))left++;
7        while(left<right && !Character.isLetterOrDigit(s.charAt(right)))right--;
8        if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right)))return false;
9        left++;
10        right--;
11       }
12       return true;
13    }
14}