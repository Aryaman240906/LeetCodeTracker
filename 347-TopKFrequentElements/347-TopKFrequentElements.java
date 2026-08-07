// Last updated: 07/08/2026, 18:54:07
class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {

            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }
        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

            int number = entry.getKey();
            int frequency = entry.getValue();

            buckets[frequency].add(number);
        }

        int[] ans = new int[k];
        int index = 0;

        for (int frequency = buckets.length - 1;
             frequency >= 1 && index < k;
             frequency--) {

            for (int number : buckets[frequency]) {

                ans[index] = number;
                index++;

                if (index == k)
                    return ans;
            }
        }

        return ans;
    }
}