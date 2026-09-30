// Last updated: 30/09/2026, 22:29:20
1class Solution {
2    public int[] maxDepthAfterSplit(String seq) {
3        int[] answer = new int[seq.length()];
4        int depth = 0;
5        for (int i = 0; i < seq.length(); i++) {
6            if (seq.charAt(i) == '(') {
7                depth++;
8                answer[i] = depth % 2;
9            } else {
10                answer[i] = depth % 2;
11                depth--;
12            }
13        }
14        return answer;
15    }
16}