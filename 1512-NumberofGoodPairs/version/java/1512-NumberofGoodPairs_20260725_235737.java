// Last updated: 25/07/2026, 23:57:37
1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        HashMap<Integer, Integer> freq = new HashMap<>();
4        for (int num : arr) {
5            freq.put(num, freq.getOrDefault(num, 0) + 1);
6        }
7        HashSet<Integer> seen = new HashSet<>();
8        for (int count : freq.values()) {
9
10            if (!seen.add(count)) {
11                return false;
12            }
13
14        }
15        return true;
16    }
17}