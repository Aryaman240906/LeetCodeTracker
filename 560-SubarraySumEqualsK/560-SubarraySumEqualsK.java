// Last updated: 11/08/2026, 20:15:20
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefix = 0;
        int ans = 0;
        for(int num : nums){
            prefix += num;
            int need = prefix - k;
            if(map.containsKey(need)){
                ans += map.get(need);
            }
            if(map.containsKey(prefix)){
                map.put(prefix,map.get(prefix)+1);
            }else{
                map.put(prefix,1);
            }
        }
        return ans;
    }
}