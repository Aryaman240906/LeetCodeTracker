// Last updated: 09/11/2026, 10:32:07
1
2class Solution {
3    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
4        TreeSet<Integer> available = new TreeSet<>();
5
6        for (int i = 0; i < k; i++) {
7            available.add(i);
8        }
9
10        PriorityQueue<int[]> busy = new PriorityQueue<>(
11            (a, b) -> Integer.compare(a[0], b[0])
12        );
13
14        int[] handled = new int[k];
15
16        for (int i = 0; i < arrival.length; i++) {
17
18            while (!busy.isEmpty() && busy.peek()[0] <= arrival[i]) {
19                available.add(busy.poll()[1]);
20            }
21
22            if (available.isEmpty()) {
23                continue;
24            }
25
26            int preferred = i % k;
27
28            Integer server = available.ceiling(preferred);
29
30            if (server == null) {
31                server = available.first();
32            }
33
34            available.remove(server);
35
36            handled[server]++;
37
38            busy.offer(new int[]{arrival[i] + load[i], server});
39        }
40
41        int max = 0;
42
43        for (int count : handled) {
44            max = Math.max(max, count);
45        }
46
47        List<Integer> result = new ArrayList<>();
48
49        for (int i = 0; i < k; i++) {
50            if (handled[i] == max) {
51                result.add(i);
52            }
53        }
54        return result;
55    }
56}
57