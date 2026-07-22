// Last updated: 22/07/2026, 20:41:00
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int i =0;
        while(i<n){
            int idx = nums[i]-1;
            if(nums[i]!= nums[idx]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }else{
                i++;
            }
        }
        for(int j=0; j<n; j++){
            if(nums[j] != j+1){
                result.add(j+1);
            }
        }
        return result;
    }
}