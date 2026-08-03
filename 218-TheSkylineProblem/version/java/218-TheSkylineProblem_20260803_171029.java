// Last updated: 03/08/2026, 17:10:29
1class Solution {
2    public boolean isPathCrossing(String path) {
3        int x=0;
4        int y=0;
5        HashSet<String> set = new HashSet<>();
6        set.add(x+","+y);
7        for(char dir : path.toCharArray()){
8            if(dir=='N'){
9                y++;
10            }
11            else if(dir=='S'){
12                y--;
13            }
14            else if(dir=='E'){
15                x++;
16            }
17            else{
18                x--;
19            }
20            String coordinate = x+","+y;
21            if(set.contains(coordinate)){
22                return true;
23            }
24            set.add(coordinate);
25        }
26        return false;
27    }
28}