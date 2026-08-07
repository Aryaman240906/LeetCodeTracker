// Last updated: 07/08/2026, 18:51:29
class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        int maxOdd = 0;
        int minEven = 101;
        for(int i=0; i<freq.length; i++){
            if(freq[i]>0 && freq[i]%2==1){
              maxOdd = Math.max(maxOdd,freq[i]);
            }
            if(freq[i]>0 && freq[i]%2==0){
            minEven = Math.min(minEven,freq[i]);
            }
        }
        return maxOdd - minEven; 
    }
}