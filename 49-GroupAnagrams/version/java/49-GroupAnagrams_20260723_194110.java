// Last updated: 23/07/2026, 19:41:10
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String,List<String>>map = new HashMap<>();
4        for(String string : strs){
5            int[] freq = new int[26];
6            for(char c : string.toCharArray()){
7                freq[c - 'a']++;
8            }
9            StringBuilder key = new StringBuilder();
10            for(int count : freq){
11                key.append('#').append(count);
12            }
13            String signature = key.toString();
14            map.putIfAbsent(signature,new ArrayList<>());
15            map.get(signature).add(string);
16        }
17        return new ArrayList<>(map.values());
18    }
19}