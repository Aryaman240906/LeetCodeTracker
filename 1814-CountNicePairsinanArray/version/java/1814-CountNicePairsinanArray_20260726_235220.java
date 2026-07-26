// Last updated: 26/07/2026, 23:52:20
1class Solution {
2
3    public long countBadPairs(int[] nums) {
4
5        int n = nums.length;
6
7        long totalPairs = (long) n * (n - 1) / 2;
8
9        long goodPairs = 0;
10
11        HashMap<Integer, Integer> map = new HashMap<>();
12
13        for (int i = 0; i < n; i++) {
14
15            int key = nums[i] - i;
16
17            goodPairs += map.getOrDefault(key, 0);
18
19            map.put(key, map.getOrDefault(key, 0) + 1);
20        }
21
22        return totalPairs - goodPairs;
23    }
24}