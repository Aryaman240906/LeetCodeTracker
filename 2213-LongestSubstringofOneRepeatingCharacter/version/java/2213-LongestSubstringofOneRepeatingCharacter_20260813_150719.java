// Last updated: 13/08/2026, 15:07:19
1class Solution {
2
3    class Node {
4        int length;
5        int prefix;
6        int suffix;
7        int best;
8        char leftChar;
9        char rightChar;
10
11        Node() {
12        }
13
14        Node(char c) {
15            length = 1;
16            prefix = 1;
17            suffix = 1;
18            best = 1;
19            leftChar = c;
20            rightChar = c;
21        }
22    }
23
24    Node[] tree;
25    char[] s;
26
27    public int[] longestRepeating(
28            String s,
29            String queryCharacters,
30            int[] queryIndices) {
31
32        this.s = s.toCharArray();
33
34        int n = s.length();
35
36        tree = new Node[4 * n];
37
38        build(1, 0, n - 1);
39
40        int[] answer = new int[queryIndices.length];
41
42        for (int i = 0; i < queryIndices.length; i++) {
43
44            int index = queryIndices[i];
45            char character = queryCharacters.charAt(i);
46
47            this.s[index] = character;
48
49            update(1, 0, n - 1, index, character);
50
51            answer[i] = tree[1].best;
52        }
53
54        return answer;
55    }
56
57    private void build(int node, int left, int right) {
58
59        if (left == right) {
60            tree[node] = new Node(s[left]);
61            return;
62        }
63
64        int mid = left + (right - left) / 2;
65
66        build(node * 2, left, mid);
67        build(node * 2 + 1, mid + 1, right);
68
69        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
70    }
71
72    private void update(
73            int node,
74            int left,
75            int right,
76            int index,
77            char character) {
78
79        if (left == right) {
80            tree[node] = new Node(character);
81            return;
82        }
83
84        int mid = left + (right - left) / 2;
85
86        if (index <= mid) {
87            update(node * 2, left, mid, index, character);
88        } else {
89            update(node * 2 + 1, mid + 1, right, index, character);
90        }
91
92        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
93    }
94
95    private Node merge(Node left, Node right) {
96
97        Node result = new Node();
98
99        result.length = left.length + right.length;
100
101        result.leftChar = left.leftChar;
102        result.rightChar = right.rightChar;
103
104        result.prefix = left.prefix;
105
106        if (left.prefix == left.length &&
107            left.rightChar == right.leftChar) {
108
109            result.prefix = left.length + right.prefix;
110        }
111
112        result.suffix = right.suffix;
113
114        if (right.suffix == right.length &&
115            left.rightChar == right.leftChar) {
116
117            result.suffix = right.length + left.suffix;
118        }
119
120        result.best = Math.max(left.best, right.best);
121
122        if (left.rightChar == right.leftChar) {
123            result.best = Math.max(
124                result.best,
125                left.suffix + right.prefix
126            );
127        }
128
129        return result;
130    }
131}