// Last updated: 14/07/2026, 20:13:02
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>triangle = new ArrayList<>();
        for(int i = 0 ; i<numRows ; i++){
            List<Integer>row = new ArrayList<>();
            row.add(1);
            for(int j = 1 ; j < i; j++){
                row.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
            }
            if(i>0)row.add(1);
            triangle.add(row);
        }
    return triangle;
    }
}