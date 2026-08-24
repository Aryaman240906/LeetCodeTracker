// Last updated: 24/08/2026, 16:42:47
1class Solution {
2    private boolean isPalindrome(String s){
3        int i=0;
4        int j=s.length()-1;
5        boolean isPalindrome = false;
6        while(i<j){
7            if(s.charAt(i)==s.charAt(j)){
8                isPalindrome = true;
9                i++;
10                j--;
11            }else{
12                isPalindrome = false;
13                break;
14            }
15        }
16        return isPalindrome;
17    }
18    public boolean canConstruct(String s, int k) {
19        if(s.length()<k)return false;
20        int[] freq = new int[26];
21        for(char c : s.toCharArray()){
22            freq[c-'a']++;
23        }
24        int oddCount = 0;
25        for(int num : freq){
26            if(num%2==1){
27                oddCount++;
28            }
29        }
30        if(oddCount>k)return false;
31        return true;
32    }
33}