// Last updated: 21/08/2026, 18:34:31
1class Solution {
2    public long findKthSmallest(int[] coins, int k) {
3
4        long low = 1;
5        long high = (long) coins[0] * k;
6
7        for (int coin : coins) {
8            high = Math.min(high, (long) coin * k);
9        }
10
11        while (low < high) {
12
13            long mid = low + (high - low) / 2;
14
15            if (countAmounts(coins, mid) >= k) {
16                high = mid;
17            } else {
18                low = mid + 1;
19            }
20        }
21
22        return low;
23    }
24
25    private long countAmounts(int[] coins, long x) {
26
27        long count = 0;
28        int n = coins.length;
29
30        for (int mask = 1; mask < (1 << n); mask++) {
31
32            long lcm = 1;
33            int bits = 0;
34            boolean valid = true;
35
36            for (int i = 0; i < n; i++) {
37
38                if ((mask & (1 << i)) != 0) {
39                    bits++;
40
41                    long gcd = gcd(lcm, coins[i]);
42                    lcm = lcm / gcd * coins[i];
43
44                    if (lcm > x) {
45                        valid = false;
46                        break;
47                    }
48                }
49            }
50
51            if (!valid) {
52                continue;
53            }
54
55            long multiples = x / lcm;
56
57            if ((bits & 1) == 1) {
58                count += multiples;
59            } else {
60                count -= multiples;
61            }
62        }
63
64        return count;
65    }
66
67    private long gcd(long a, long b) {
68
69        while (b != 0) {
70            long temp = a % b;
71            a = b;
72            b = temp;
73        }
74
75        return a;
76    }
77}