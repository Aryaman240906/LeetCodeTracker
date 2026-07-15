// Last updated: 16/07/2026, 01:45:01
class Solution {
    public int removeElement(int[] nums, int val) {
        int write = 0;
        for(int read =0 ; read<nums.length; read++){
            if(nums[read] != val){
                nums[write] = nums[read];
                write++;
            }
        }
        return write;
    }
}