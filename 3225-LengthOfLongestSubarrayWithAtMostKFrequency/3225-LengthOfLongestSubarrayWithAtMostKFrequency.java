// Last updated: 13/08/2026, 15:09:56
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int maxLength = 0;
        int left = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right=0; right<nums.length; right++){
            if(map.containsKey(nums[right])){
                map.put(nums[right],map.get(nums[right])+1);
            }else{
                map.put(nums[right], 1);
            }
while(map.get(nums[right])>k){
map.put(nums[left], map.get(nums[left])-1);
left++;
}
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}