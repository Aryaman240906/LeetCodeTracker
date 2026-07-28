// Last updated: 28/07/2026, 23:15:42
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i], mp.get(nums[i])+1);
            }else{
                mp.put(nums[i],1);
            }
        }
        int maxFreq = 0;
        for(int freq : mp.values()){
            if(freq>maxFreq){
                maxFreq = freq;
            }
        }
        int sum = 0;
        for(int freq : mp.values()){
            if(freq == maxFreq){
                sum+=freq;
            }
        }
        return sum;
    }
}