// Last updated: 07/08/2026, 18:55:30
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        for(int i=0; i<first.length(); i++){
            char ch = first.charAt(i);
            for(int j=1; j<strs.length; j++){
                if(i>=strs[j].length() || strs[j].charAt(i) != ch){
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
}