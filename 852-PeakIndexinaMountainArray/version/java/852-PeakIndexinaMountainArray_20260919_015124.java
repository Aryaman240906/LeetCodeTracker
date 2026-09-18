// Last updated: 19/09/2026, 01:51:24
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int left = 0;
4        int right = arr.length-1;
5        while(left<right){
6            int mid = left + (right-left)/2;
7            if(arr[mid]>arr[mid+1]){
8                right = mid;
9            }else{
10                left = mid+1;
11            }
12        }
13        return left;
14    }
15}