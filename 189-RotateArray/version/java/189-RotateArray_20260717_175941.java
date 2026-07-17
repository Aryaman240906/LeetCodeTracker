// Last updated: 17/07/2026, 17:59:41
1class Solution {
2    private void reverse(int[] nums, int left, int right){
3        while(left<right){
4             int temp = nums[left];
5             nums[left] = nums[right];
6             nums[right] = temp;
7             left++;
8             right--;
9        }
10    }
11    public void rotate(int[] nums, int k){  
12        int n = nums.length;
13        k%=n;
14        reverse(nums, 0, n-1);
15        reverse(nums, 0, k-1);
16        reverse(nums, k, n-1);
17    }
18}