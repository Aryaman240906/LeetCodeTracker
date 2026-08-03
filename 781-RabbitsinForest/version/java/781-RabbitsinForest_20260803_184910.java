// Last updated: 03/08/2026, 18:49:10
1class Solution {
2    public int numRabbits(int[] answers) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int num : answers){
5            if(map.containsKey(num)){
6                map.put(num,map.get(num)+1);
7            }else{
8                map.put(num,1);
9            }
10        }
11        int total =0;
12        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
13            int ans = entry.getKey();
14            int freq = entry.getValue();
15            int groupSize = ans+1;
16            int noOfGroups = (freq+groupSize-1)/groupSize;
17            total+= noOfGroups * groupSize;
18        }
19        return total;
20    }
21}