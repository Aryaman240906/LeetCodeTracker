// Last updated: 07/08/2026, 18:53:57
class Solution { 
    public char findTheDifference(String s, String t) { 
        char ans = 0; 
        for (char c : s.toCharArray()) { 
            ans ^= c; 
        } 
        for (char c : t.toCharArray()) { 
            ans ^= c; 
        } 
        return ans; 
    } 
}