// Last updated: 19/07/2026, 21:45:47
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int counter=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j!=i && nums[i] > nums[j]){
                counter++;
                }
            }
            ans[i] = counter;
            counter=0;
        }
        return ans;
    }
}