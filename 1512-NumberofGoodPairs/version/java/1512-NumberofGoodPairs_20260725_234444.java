// Last updated: 25/07/2026, 23:44:44
1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5        int count = 0;
6
7        for (int num : nums) {
8
9            count += map.getOrDefault(num, 0);
10
11            map.put(num, map.getOrDefault(num, 0) + 1);
12        }
13
14        return count;
15    }
16}