// Last updated: 19/09/2026, 01:42:36
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int left = 0;
4        int right = nums.length-1;
5        while(left<right){
6            int mid = left + (right-left)/2;
7            if(mid%2==1){
8                mid--;
9            }
10            if(nums[mid]==nums[mid+1]){
11                left = mid+2;
12            }else{
13                right = mid;
14            }
15        }
16        return nums[left];
17    }
18}