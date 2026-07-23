// Last updated: 23/07/2026, 20:09:10
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer>set = new HashSet<>();
4        for(int i=0; i<nums.length; i++){
5            if(set.contains(nums[i])){
6                return true;
7            }
8            set.add(nums[i]);
9        }
10        return false;
11    }
12}