// Last updated: 26/07/2026, 23:49:18
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> seen = new HashSet<>();
        for (int count : freq.values()) {

            if (!seen.add(count)) {
                return false;
            }

        }
        return true;
    }
}