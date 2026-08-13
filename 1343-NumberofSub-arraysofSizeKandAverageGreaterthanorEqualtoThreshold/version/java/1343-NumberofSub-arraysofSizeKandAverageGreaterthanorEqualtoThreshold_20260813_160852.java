// Last updated: 13/08/2026, 16:08:52
1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold) {
3        int currentSUM =0;
4        int valid = k*threshold;
5        int count =0;
6        int left =0;
7        for(int right=0; right<arr.length; right++){
8            currentSUM+=arr[right];
9            if(right-left+1==k){
10                if(currentSUM>=valid){
11                    count++;
12                }
13                currentSUM-=arr[left];
14                left++;
15            }
16        }
17        return count;
18    }
19}