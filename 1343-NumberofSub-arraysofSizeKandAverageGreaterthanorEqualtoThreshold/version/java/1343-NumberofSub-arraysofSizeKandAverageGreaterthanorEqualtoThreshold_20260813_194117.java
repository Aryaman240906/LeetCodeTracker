// Last updated: 13/08/2026, 19:41:17
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int[] winFreq = new int[26];
4        int[] reqFreq = new int[26];
5        int left = 0;
6        for(char c : s1.toCharArray()){
7            reqFreq[c-'a']++;
8        }
9        int matched = 0;
10        int required = 0;
11        for(int i=0; i<26; i++){
12            if(reqFreq[i]>0)required++;
13        }
14        boolean exist = false;
15        for(int right=0; right<s2.length(); right++){
16            int r = s2.charAt(right) - 'a';
17            winFreq[r]++;
18            if(winFreq[r]==reqFreq[r]){
19                matched++;
20            }
21            if(right-left+1 == s1.length()){
22                if(matched==required){
23                    exist = true;
24                    return exist;
25                }
26                int l = s2.charAt(left)-'a';
27                if(winFreq[l]==reqFreq[l])matched--;
28                winFreq[l]--;
29                left++;
30            }
31        }
32        return exist;
33    }
34}