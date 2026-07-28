// Last updated: 28/07/2026, 23:15:49
class Solution {

    public int countNicePairs(int[] nums) {

        int MOD = 1_000_000_007;

        HashMap<Integer, Integer> map = new HashMap<>();

        long count = 0;

        for (int num : nums) {

            int key = num - reverse(num);

            count = (count + map.getOrDefault(key, 0)) % MOD;

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return (int) count;
    }

    private int reverse(int num) {

        int rev = 0;

        while (num > 0) {

            rev = rev * 10 + num % 10;

            num /= 10;
        }

        return rev;
    }
}