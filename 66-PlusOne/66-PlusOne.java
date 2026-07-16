// Last updated: 16/07/2026, 22:18:07
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0 ; i--){
           if(digits[i]<9){
           ++digits[i];
           return digits;
            }
           digits[i]=0;
        }
        int[] result = new int [digits.length+1];
        result[0] = 1;
        return result;
    }
}