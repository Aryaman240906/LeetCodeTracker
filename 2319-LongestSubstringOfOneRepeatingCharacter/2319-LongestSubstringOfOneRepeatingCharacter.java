// Last updated: 13/08/2026, 15:10:05
class Solution {

    class Node {
        int length;
        int prefix;
        int suffix;
        int best;
        char leftChar;
        char rightChar;

        Node() {
        }

        Node(char c) {
            length = 1;
            prefix = 1;
            suffix = 1;
            best = 1;
            leftChar = c;
            rightChar = c;
        }
    }

    Node[] tree;
    char[] s;

    public int[] longestRepeating(
            String s,
            String queryCharacters,
            int[] queryIndices) {

        this.s = s.toCharArray();

        int n = s.length();

        tree = new Node[4 * n];

        build(1, 0, n - 1);

        int[] answer = new int[queryIndices.length];

        for (int i = 0; i < queryIndices.length; i++) {

            int index = queryIndices[i];
            char character = queryCharacters.charAt(i);

            this.s[index] = character;

            update(1, 0, n - 1, index, character);

            answer[i] = tree[1].best;
        }

        return answer;
    }

    private void build(int node, int left, int right) {

        if (left == right) {
            tree[node] = new Node(s[left]);
            return;
        }

        int mid = left + (right - left) / 2;

        build(node * 2, left, mid);
        build(node * 2 + 1, mid + 1, right);

        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }

    private void update(
            int node,
            int left,
            int right,
            int index,
            char character) {

        if (left == right) {
            tree[node] = new Node(character);
            return;
        }

        int mid = left + (right - left) / 2;

        if (index <= mid) {
            update(node * 2, left, mid, index, character);
        } else {
            update(node * 2 + 1, mid + 1, right, index, character);
        }

        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }

    private Node merge(Node left, Node right) {

        Node result = new Node();

        result.length = left.length + right.length;

        result.leftChar = left.leftChar;
        result.rightChar = right.rightChar;

        result.prefix = left.prefix;

        if (left.prefix == left.length &&
            left.rightChar == right.leftChar) {

            result.prefix = left.length + right.prefix;
        }

        result.suffix = right.suffix;

        if (right.suffix == right.length &&
            left.rightChar == right.leftChar) {

            result.suffix = right.length + left.suffix;
        }

        result.best = Math.max(left.best, right.best);

        if (left.rightChar == right.leftChar) {
            result.best = Math.max(
                result.best,
                left.suffix + right.prefix
            );
        }

        return result;
    }
}