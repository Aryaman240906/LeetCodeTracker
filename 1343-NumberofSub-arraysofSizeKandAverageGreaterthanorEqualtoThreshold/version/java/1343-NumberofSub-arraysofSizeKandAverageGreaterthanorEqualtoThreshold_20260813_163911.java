// Last updated: 13/08/2026, 16:39:11
1class Solution {
2    private boolean isVowel(char c){
3        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')return true;
4        return false;
5    }
6    public int maxVowels(String s, int k) {
7        int vowelsCount = 0;
8        int maxVowels = 0;
9        int left = 0;
10        for(int right=0; right<s.length(); right++){
11            if(isVowel(s.charAt(right))){
12                vowelsCount++;
13            }
14            if(right-left+1==k){
15                maxVowels = Math.max(maxVowels, vowelsCount);
16                if(isVowel(s.charAt(left))){
17                    vowelsCount--;
18                }
19                left++;
20            }
21        }
22        return maxVowels;
23    }
24}