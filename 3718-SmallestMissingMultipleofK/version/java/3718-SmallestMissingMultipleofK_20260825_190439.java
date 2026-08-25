// Last updated: 25/08/2026, 19:04:39
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int num : nums){
5            set.add(num);
6        }
7        int candidate = k;
8        while(set.contains(candidate)){
9            candidate+=k;
10        }
11        return candidate;
12    }
13}