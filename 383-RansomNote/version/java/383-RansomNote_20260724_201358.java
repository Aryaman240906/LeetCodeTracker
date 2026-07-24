// Last updated: 24/07/2026, 20:13:58
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String[] words = s.split(" ");
4        if(pattern.length()!=words.length){
5            return false;
6        }
7        HashMap<Character,String>map1 = new HashMap<>();
8        HashMap<String,Character>map2 = new HashMap<>();
9        for(int i=0; i<pattern.length(); i++){
10            char c = pattern.charAt(i);
11            String word = words[i];
12            if(map1.containsKey(c)){
13                if(!map1.get(c).equals(word)){
14                    return false;
15                }
16            }
17            if(map2.containsKey(word)){
18                if(map2.get(word)!=c){
19                    return false;
20                }
21            }
22            map1.put(c,word);
23            map2.put(word,c);
24        }
25        return true;
26    }
27}