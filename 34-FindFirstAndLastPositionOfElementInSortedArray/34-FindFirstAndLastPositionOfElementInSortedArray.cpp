// Last updated: 11/07/2026, 00:06:21
class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int n = nums.size();
    
    // Finding first occurrence (lower bound)
    int left = 0, right = n - 1;
    int first = -1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] >= target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    if (left < n && nums[left] == target) first = left;
    else return {-1, -1};  // Target not found

    // Finding last occurrence (upper bound - 1)
    left = 0, right = n - 1;
    int last = -1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] <= target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    last = right;

    return {first, last};
    }
};