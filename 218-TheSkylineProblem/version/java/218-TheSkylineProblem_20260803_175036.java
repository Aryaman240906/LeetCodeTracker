// Last updated: 03/08/2026, 17:50:36
1class Solution {
2    public int equalPairs(int[][] grid) {
3        int n = grid.length;
4        HashMap<List<Integer>,Integer> map = new HashMap<>();
5        for(int i=0; i<n; i++){
6            List<Integer> row = new ArrayList<>();
7            for(int j=0; j<n; j++){
8                row.add(grid[i][j]);
9            }
10            if(map.containsKey(row)){
11                map.put(row,map.get(row)+1);
12            }
13            else{
14                map.put(row,1);
15            }
16        }
17        int ans=0;
18        for(int j=0; j<n; j++){
19            List<Integer> col = new ArrayList<>();
20            for(int i=0; i<n; i++){
21                col.add(grid[i][j]);
22            }
23            if(map.containsKey(col)){
24                ans+=map.get(col);
25            }
26        }
27        return ans;
28    }
29}