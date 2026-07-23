// Last updated: 23/07/2026, 19:45:45
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String, List<String>> map = new HashMap<>();
4        for (String str : strs) {
5            char[] arr = str.toCharArray();
6            Arrays.sort(arr);
7            String key = new String(arr);
8            map.putIfAbsent(key, new ArrayList<>());
9            map.get(key).add(str);
10        }
11        return new ArrayList<>(map.values());
12    }
13}