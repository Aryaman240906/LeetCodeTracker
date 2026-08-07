// Last updated: 07/08/2026, 18:51:43
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] ans = new int[2];
        int[] freq = new int[n*n+1];
        for(int[] arr : grid){
            for(int num : arr){
                freq[num]++;
            }
        }
        for(int i =1; i<=n*n; i++){
            if(freq[i]==2){
                ans[0] = i;
            }
            if(freq[i]==0){
                ans[1] = i;
            }
        }
        return ans;
    }
}