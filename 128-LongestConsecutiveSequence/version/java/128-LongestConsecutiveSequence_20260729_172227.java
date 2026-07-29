// Last updated: 29/07/2026, 17:22:27
1class Solution {
2    public int longestConsecutive(int[] nums) {
3       HashSet<Integer>set = new HashSet<>();
4       int maxLength = 0;
5       for(int num : nums){
6        set.add(num);
7       }
8       for(int num : set ){
9          if(!set.contains(num-1)){
10              int currentNum = num;
11              int currentLength = 1;
12              while(set.contains(currentNum+1)){
13                currentNum++;
14                currentLength++;
15                }
16           maxLength = Math.max(maxLength , currentLength);
17           }
18        }
19        return maxLength;
20    }
21}