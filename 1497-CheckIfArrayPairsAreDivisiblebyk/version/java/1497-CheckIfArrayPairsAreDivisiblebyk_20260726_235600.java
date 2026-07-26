// Last updated: 26/07/2026, 23:56:00
1class Solution {
2    public boolean canArrange(int[] arr, int k) {
3
4        int[] freq = new int[k];
5        for (int num : arr) {
6            int rem = ((num % k) + k) % k;
7            freq[rem]++;
8        }
9        if (freq[0] % 2 != 0)
10            return false;
11        for (int r = 1; r <= k / 2; r++) {
12
13            if (r == k - r) {
14                if (freq[r] % 2 != 0)
15                    return false;
16            } else {
17                if (freq[r] != freq[k - r])
18                    return false;
19            }
20        }
21
22        return true;
23    }
24}