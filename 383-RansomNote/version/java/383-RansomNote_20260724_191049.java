// Last updated: 24/07/2026, 19:10:49
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        int[] target_freq = new int[26];
4        int[] input_freq = new int[26];
5        for(char c : ransomNote.toCharArray()){
6            target_freq[c-'a']++;
7        }
8        for(char c : magazine.toCharArray()){
9            input_freq[c-'a']++;
10        }
11        for(int i=0; i<26; i++){
12            if(input_freq[i]<target_freq[i]){
13                return false;
14            }
15        }
16        return true;
17    }
18}