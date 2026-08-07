// Last updated: 07/08/2026, 18:52:21
class Solution {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y=0;
        HashSet<String> set = new HashSet<>();
        set.add(x+","+y);
        for(char dir : path.toCharArray()){
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }
            String coordinate = x+","+y;
            if(set.contains(coordinate)){
                return true;
            }
            set.add(coordinate);
        }
        return false;
    }
}