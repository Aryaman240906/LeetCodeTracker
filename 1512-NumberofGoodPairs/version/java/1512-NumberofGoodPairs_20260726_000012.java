// Last updated: 26/07/2026, 00:00:12
1class Solution {
2    public List<List<Integer>> findWinners(int[][] matches) {
3
4        HashMap<Integer, Integer> losses = new HashMap<>();
5
6        for (int[] match : matches) {
7
8            int winner = match[0];
9            int loser = match[1];
10
11            losses.putIfAbsent(winner, 0);
12            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
13        }
14
15        List<Integer> zeroLoss = new ArrayList<>();
16        List<Integer> oneLoss = new ArrayList<>();
17
18        for (int player : losses.keySet()) {
19
20            int count = losses.get(player);
21
22            if (count == 0)
23                zeroLoss.add(player);
24
25            else if (count == 1)
26                oneLoss.add(player);
27        }
28
29        Collections.sort(zeroLoss);
30        Collections.sort(oneLoss);
31
32        List<List<Integer>> ans = new ArrayList<>();
33        ans.add(zeroLoss);
34        ans.add(oneLoss);
35
36        return ans;
37    }
38}