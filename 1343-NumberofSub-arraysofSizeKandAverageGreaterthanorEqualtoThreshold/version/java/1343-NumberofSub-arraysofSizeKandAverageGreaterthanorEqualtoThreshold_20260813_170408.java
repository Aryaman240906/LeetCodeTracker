// Last updated: 13/08/2026, 17:04:08
1class Solution {
2    public int countGoodSubstrings(String s) {
3       int[] freq = new int[26];
4       int distinct = 0;
5       int count = 0;
6       int left = 0;
7       for(int right=0; right<s.length(); right++){
8        int r = s.charAt(right)-'a';
9        if(freq[r]==0)distinct++;
10        freq[r]++;
11        if(right-left+1 == 3){
12            if(distinct==3){
13                count++;
14            }
15            int l = s.charAt(left)-'a';
16            freq[l]--;
17            if(freq[l]==0){
18                distinct--;
19                }
20            left++;
21            }
22        }
23        return count;
24    }
25}
26