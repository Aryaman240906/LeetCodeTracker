// Last updated: 28/07/2026, 23:15:46
class Solution {
    /*private String normalize(String s){
        int i=0;
        while(i<s.length()-1 && s.charAt(i) =='0'){
            i++;
        }
        return s.substring(i);
    }*/
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums,(a,b)->{
            /*String x = normalize(a);
            String y = normalize(b);*/
            //replace a with x and b with y in below code
            if(a.length() != b.length()){ 
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });
        return nums[nums.length-k];
    }
}