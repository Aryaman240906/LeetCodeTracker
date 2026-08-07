// Last updated: 07/08/2026, 20:11:08
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        map.put(0,1);
5        int prefix = 0;
6        int ans = 0;
7        for(int num : nums){
8            prefix += num;
9            int need = prefix - k;
10            if(map.containsKey(need)){
11                ans += map.get(need);
12            }
13            if(map.containsKey(prefix)){
14                map.put(prefix,map.get(prefix)+1);
15            }else{
16                map.put(prefix,1);
17            }
18        }
19        return ans;
20    }
21}