// Last updated: 24/07/2026, 18:59:04
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        HashMap<Character,Character> map1 = new HashMap<>();
4        HashMap<Character,Character> map2 = new HashMap<>();
5        for(int i=0; i<s.length(); i++){
6            char c1 = s.charAt(i);
7            char c2 = t.charAt(i);
8            if(map1.containsKey(c1) && map1.get(c1) != c2){
9                return false;
10            }
11            if(map2.containsKey(c2) && map2.get(c2) != c1){
12                return false;
13            }
14            map1.put(c1,c2);
15            map2.put(c2,c1);
16        }
17        return true;
18    }
19}