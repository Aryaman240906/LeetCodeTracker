// Last updated: 25/07/2026, 23:45:40
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<s.length();i++){

            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}