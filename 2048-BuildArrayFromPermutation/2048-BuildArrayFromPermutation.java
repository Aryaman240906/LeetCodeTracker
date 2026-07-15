// Last updated: 15/07/2026, 22:44:23
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            nums[i]+= (nums[nums[i]]%n)*n;
        }
        for(int j = 0; j<n; j++){
            nums[j] /= n;
        }
        return nums;
    }
}