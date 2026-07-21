// Last updated: 21/07/2026, 20:54:35
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> result = new ArrayList<>();
4        int n = nums.length;
5        int i =0;
6        while(i<n){
7            int idx = nums[i]-1;
8            if(nums[i]!= nums[idx]){
9                int temp = nums[i];
10                nums[i] = nums[idx];
11                nums[idx] = temp;
12            }else{
13                i++;
14            }
15        }
16        for(int j=0; j<n; j++){
17            if(nums[j] != j+1){
18                result.add(j+1);
19            }
20        }
21        return result;
22    }
23}