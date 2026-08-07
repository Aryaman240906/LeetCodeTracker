// Last updated: 07/08/2026, 18:53:15
class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : answers){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        int total =0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int ans = entry.getKey();
            int freq = entry.getValue();
            int groupSize = ans+1;
            int noOfGroups = (freq+groupSize-1)/groupSize;
            total+= noOfGroups * groupSize;
        }
        return total;
    }
}