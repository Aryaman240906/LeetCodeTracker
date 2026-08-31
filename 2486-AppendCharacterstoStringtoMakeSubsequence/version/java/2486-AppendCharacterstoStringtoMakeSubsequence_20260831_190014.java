// Last updated: 31/08/2026, 19:00:14
1class Solution {
2    public boolean areSentencesSimilar(String sentence1, String sentence2) {
3        String[] words1 = sentence1.split(" ");
4        String[] words2 = sentence2.split(" ");
5        String[] shorter;
6        String[] longer;
7        if (words1.length <= words2.length) {
8            shorter = words1;
9            longer = words2;
10        } else {
11            shorter = words2;
12            longer = words1;
13        }
14        int shorterLength = shorter.length;
15        int longerLength = longer.length;
16        int left = 0;
17        while (left < shorterLength &&
18               shorter[left].equals(longer[left])) {
19            left++;
20        }
21        int right = 0;
22        while (right < shorterLength - left &&
23               shorter[shorterLength - 1 - right]
24                   .equals(longer[longerLength - 1 - right])) {
25            right++;
26        }
27        return left + right == shorterLength;
28    }
29}