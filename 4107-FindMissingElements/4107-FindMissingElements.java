// Last updated: 07/08/2026, 18:51:26
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int[] freq = new int[101];
        int min = 101;
        int max = 0;
        for (int num : nums) {
            freq[num]++;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = min + 1; i < max; i++) {
            if (freq[i] == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}