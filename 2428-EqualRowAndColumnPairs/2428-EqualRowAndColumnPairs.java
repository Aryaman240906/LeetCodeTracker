// Last updated: 07/08/2026, 18:51:54
class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<List<Integer>,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<n; j++){
                row.add(grid[i][j]);
            }
            if(map.containsKey(row)){
                map.put(row,map.get(row)+1);
            }
            else{
                map.put(row,1);
            }
        }
        int ans=0;
        for(int j=0; j<n; j++){
            List<Integer> col = new ArrayList<>();
            for(int i=0; i<n; i++){
                col.add(grid[i][j]);
            }
            if(map.containsKey(col)){
                ans+=map.get(col);
            }
        }
        return ans;
    }
}