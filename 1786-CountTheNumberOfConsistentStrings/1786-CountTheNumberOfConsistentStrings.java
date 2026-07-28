// Last updated: 28/07/2026, 23:15:53
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> isAllowed = new HashSet<>();
        int counter = 0;
        for(char c : allowed.toCharArray()){
            isAllowed.add(c);
        }
        for(String string : words){
            boolean isConsistent = true;
            for(char c : string.toCharArray()){
                if(!isAllowed.contains(c)){
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent){
                counter++;
            }
        }
        return counter;
    }
}