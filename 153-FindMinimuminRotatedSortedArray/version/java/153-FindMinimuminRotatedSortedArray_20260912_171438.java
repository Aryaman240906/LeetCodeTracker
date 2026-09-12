// Last updated: 12/09/2026, 17:14:38
1class Solution {
2    public int findMin(int[] nums) {
3        int left = 0;
4        int right = nums.length-1;
5        while(left<right){
6            int mid = left+(right-left)/2;
7            if (nums[mid]>nums[right]){
8                left = mid+1;
9            }
10            else if(nums[mid]<nums[right]){
11                right = mid;
12            }
13            else{
14                right--;
15            }
16        }
17        return nums[left];
18    }
19}