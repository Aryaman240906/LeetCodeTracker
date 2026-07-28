// Last updated: 28/07/2026, 23:16:21
class Solution {

    public boolean isNStraightHand(int[] hand, int groupSize) {

        if (hand.length % groupSize != 0)
            return false;

        Arrays.sort(hand);

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int card : hand) {
            freq.put(card, freq.getOrDefault(card, 0) + 1);
        }

        for (int card : hand) {

            if (freq.get(card) == 0)
                continue;

            for (int i = 0; i < groupSize; i++) {

                int current = card + i;

                if (freq.getOrDefault(current, 0) == 0)
                    return false;

                freq.put(current, freq.get(current) - 1);
            }
        }

        return true;
    }
}