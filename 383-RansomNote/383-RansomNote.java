// Last updated: 25/07/2026, 23:45:42
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] target_freq = new int[26];
        int[] input_freq = new int[26];
        for(char c : ransomNote.toCharArray()){
            target_freq[c-'a']++;
        }
        for(char c : magazine.toCharArray()){
            input_freq[c-'a']++;
        }
        for(int i=0; i<26; i++){
            if(input_freq[i]<target_freq[i]){
                return false;
            }
        }
        return true;
    }
}