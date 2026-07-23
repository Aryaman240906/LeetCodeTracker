// Last updated: 23/07/2026, 20:59:20
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashSet<Integer>window = new HashSet<>();
4        for(int i=0; i<nums.length; i++){
5            if(window.contains(nums[i])){
6                return true;
7            }
8            window.add(nums[i]);
9            if(window.size()>k){
10                window.remove(nums[i-k]);
11            }
12        }
13        return false;
14    }
15}