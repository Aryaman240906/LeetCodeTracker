// Last updated: 12/09/2026, 16:24:51
1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int left = 0;
4        int right = arr.length-1;
5        while(left<=right){
6            int mid = left + (right-left)/2;
7            int missing = arr[mid]-(mid+1);
8            if(missing<k){
9                left=mid+1;
10            }else{
11                right=mid-1;
12            }
13        }
14        return k+left;
15    }
16}