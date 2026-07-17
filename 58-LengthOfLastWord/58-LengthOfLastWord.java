// Last updated: 17/07/2026, 18:53:01
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int counter = 0;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            counter++;
            i--;
        }
        return counter;
    }
}