// Last updated: 27/07/2026, 18:26:49
1class Solution {
2    /*private String normalize(String s){
3        int i=0;
4        while(i<s.length()-1 && s.charAt(i) =='0'){
5            i++;
6        }
7        return s.substring(i);
8    }*/
9    public String kthLargestNumber(String[] nums, int k) {
10        Arrays.sort(nums,(a,b)->{
11            /*String x = normalize(a);
12            String y = normalize(b);*/
13            //replace a with x and b with y in below code
14            if(a.length() != b.length()){ 
15                return a.length() - b.length();
16            }
17            return a.compareTo(b);
18        });
19        return nums[nums.length-k];
20    }
21}