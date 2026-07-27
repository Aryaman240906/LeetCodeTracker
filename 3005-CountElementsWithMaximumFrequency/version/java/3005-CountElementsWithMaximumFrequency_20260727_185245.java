// Last updated: 27/07/2026, 18:52:45
1class Solution {
2    public int maxFrequencyElements(int[] nums) {
3        HashMap<Integer,Integer>mp = new HashMap<>();
4        for(int i=0; i<nums.length; i++){
5            if(mp.containsKey(nums[i])){
6                mp.put(nums[i], mp.get(nums[i])+1);
7            }else{
8                mp.put(nums[i],1);
9            }
10        }
11        int maxFreq = 0;
12        for(int freq : mp.values()){
13            if(freq>maxFreq){
14                maxFreq = freq;
15            }
16        }
17        int sum = 0;
18        for(int freq : mp.values()){
19            if(freq == maxFreq){
20                sum+=freq;
21            }
22        }
23        return sum;
24    }
25}