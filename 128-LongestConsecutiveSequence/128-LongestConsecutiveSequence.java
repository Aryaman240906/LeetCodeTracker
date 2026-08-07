// Last updated: 07/08/2026, 18:54:43
class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer>set = new HashSet<>();
       int maxLength = 0;
       for(int num : nums){
        set.add(num);
       }
       for(int num : set ){
          if(!set.contains(num-1)){
              int currentNum = num;
              int currentLength = 1;
              while(set.contains(currentNum+1)){
                currentNum++;
                currentLength++;
                }
           maxLength = Math.max(maxLength , currentLength);
           }
        }
        return maxLength;
    }
}