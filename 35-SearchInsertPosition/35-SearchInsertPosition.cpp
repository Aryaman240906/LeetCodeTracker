// Last updated: 11/07/2026, 00:06:14
class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int low , high ,mid;
        low = 0;
        high = nums.size()-1;
        while(low<=high){
            mid = (int)low + (high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
};