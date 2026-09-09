// Last updated: 09/09/2026, 19:32:07
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = firstBinarySearch(nums,target);
4        int last = secondBinarySearch(nums,target);
5        return new int[]{first,last};
6    }
7    private int firstBinarySearch(int[]nums,int target){
8        int left = 0;
9        int right = nums.length-1;
10        int ans = -1;
11        while(left<=right){
12            int mid = left+(right-left)/2;
13            if(nums[mid]==target){
14                ans = mid;
15                right = mid-1;
16            }
17            else if(nums[mid]<target){
18                left = mid+1;
19            }
20            else{
21                right = mid-1;
22            }
23        }
24        return ans;
25    }
26    private int secondBinarySearch(int[]nums,int target){
27        int left = 0;
28        int right = nums.length-1;
29        int ans = -1;
30        while(left<=right){
31            int mid = left+(right-left)/2;
32            if(nums[mid]==target){
33                ans = mid;
34                left = mid+1;
35            }
36            else if(nums[mid]<target){
37                left = mid+1;
38            }
39            else{
40                right = mid-1;
41            }
42        }
43        return ans;
44    }
45}