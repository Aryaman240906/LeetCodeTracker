// Last updated: 26/07/2026, 23:59:29
1class Solution {
2
3    public boolean isNStraightHand(int[] hand, int groupSize) {
4
5        if (hand.length % groupSize != 0)
6            return false;
7
8        Arrays.sort(hand);
9
10        HashMap<Integer, Integer> freq = new HashMap<>();
11
12        for (int card : hand) {
13            freq.put(card, freq.getOrDefault(card, 0) + 1);
14        }
15
16        for (int card : hand) {
17
18            if (freq.get(card) == 0)
19                continue;
20
21            for (int i = 0; i < groupSize; i++) {
22
23                int current = card + i;
24
25                if (freq.getOrDefault(current, 0) == 0)
26                    return false;
27
28                freq.put(current, freq.get(current) - 1);
29            }
30        }
31
32        return true;
33    }
34}