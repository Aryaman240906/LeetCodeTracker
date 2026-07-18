// Last updated: 18/07/2026, 23:58:54
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int k=0;
        for(int i=0; i<n; i++){
            ans[k++] = nums[i];
            ans[k++] = nums[i+n];
        }
        return ans;
    }
}