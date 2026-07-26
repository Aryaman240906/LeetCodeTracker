// Last updated: 26/07/2026, 23:50:19
1class Solution {
2
3    public int countNicePairs(int[] nums) {
4
5        int MOD = 1_000_000_007;
6
7        HashMap<Integer, Integer> map = new HashMap<>();
8
9        long count = 0;
10
11        for (int num : nums) {
12
13            int key = num - reverse(num);
14
15            count = (count + map.getOrDefault(key, 0)) % MOD;
16
17            map.put(key, map.getOrDefault(key, 0) + 1);
18        }
19
20        return (int) count;
21    }
22
23    private int reverse(int num) {
24
25        int rev = 0;
26
27        while (num > 0) {
28
29            rev = rev * 10 + num % 10;
30
31            num /= 10;
32        }
33
34        return rev;
35    }
36}