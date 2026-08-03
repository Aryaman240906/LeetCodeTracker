// Last updated: 03/08/2026, 21:23:16
1class Solution {
2    public int majorityElement(int[] nums) {
3        int count = 0;
4        int candidate = 0;
5        for(int num : nums){
6            if(count == 0){
7                candidate = num;
8            }
9            if(num == candidate){
10                count++;
11            }else{
12                count--;
13            }
14        }
15        return candidate;
16    }
17}