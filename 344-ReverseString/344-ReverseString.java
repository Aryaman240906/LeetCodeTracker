// Last updated: 17/07/2026, 18:52:51
class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        reverse(s ,0 ,n-1);
    }
    private void reverse(char[] s, int left , int right){
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}