// Last updated: 10/09/2026, 19:17:26
1class Solution {
2    int ans = 0;
3
4    class Pair {
5        int sum;
6        int count;
7
8        Pair(int sum, int count) {
9            this.sum = sum;
10            this.count = count;
11        }
12    }
13
14    public int averageOfSubtree(TreeNode root) {
15        solve(root);
16        return ans;
17    }
18
19    private Pair solve(TreeNode node) {
20        if (node == null) {
21            return new Pair(0, 0);
22        }
23
24        Pair left = solve(node.left);
25        Pair right = solve(node.right);
26
27        int sum = node.val + left.sum + right.sum;
28        int count = 1 + left.count + right.count;
29
30        if (sum / count == node.val) {
31            ans++;
32        }
33
34        return new Pair(sum, count);
35    }
36}