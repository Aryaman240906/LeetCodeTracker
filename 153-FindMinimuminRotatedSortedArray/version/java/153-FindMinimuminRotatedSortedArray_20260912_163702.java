// Last updated: 12/09/2026, 16:37:02
1class Solution {
2    public int findMin(int[] nums) {
3        int left = 0;
4        int right = nums.length-1;
5        while(left<right){
6            int mid = left + (right-left)/2;
7            if(nums[mid]>nums[right]){
8                left=mid+1;
9            }else{
10                right=mid;
11            }
12        }
13        return nums[left];
14    }
15}