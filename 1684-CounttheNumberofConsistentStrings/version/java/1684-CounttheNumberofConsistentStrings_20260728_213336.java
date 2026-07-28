// Last updated: 28/07/2026, 21:33:36
1class Solution {
2    public int countConsistentStrings(String allowed, String[] words) {
3        HashSet<Character> isAllowed = new HashSet<>();
4        int counter = 0;
5        for(char c : allowed.toCharArray()){
6            isAllowed.add(c);
7        }
8        for(String string : words){
9            boolean isConsistent = true;
10            for(char c : string.toCharArray()){
11                if(!isAllowed.contains(c)){
12                    isConsistent = false;
13                    break;
14                }
15            }
16            if(isConsistent){
17                counter++;
18            }
19        }
20        return counter;
21    }
22}