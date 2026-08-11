// Last updated: 11/08/2026, 20:48:13
1class Solution {
2    public int missingInteger(int[] nums) {
3        int sum = nums[0];
4        int i = 1;
5        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
6            sum += nums[i];
7            i++;
8        }
9        HashSet<Integer> present = new HashSet<>();
10        for (int num : nums) {
11            present.add(num);
12        }
13        int candidate = sum;
14        while (present.contains(candidate)) {
15            candidate++;
16        }
17        return candidate;
18    }
19}