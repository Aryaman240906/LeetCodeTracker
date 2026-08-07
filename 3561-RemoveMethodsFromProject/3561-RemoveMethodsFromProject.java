// Last updated: 07/08/2026, 18:51:39
class Solution {

    private List<List<Integer>> buildGraph(int n, int[][] invocations) {

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int[] edge : invocations)
            graph.get(edge[0]).add(edge[1]);

        return graph;
    }

    private boolean[] bfs(List<List<Integer>> graph, int n, int source) {

        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();

        visited[source] = true;
        queue.offer(source);

        while (!queue.isEmpty()) {

            int u = queue.poll();

            for (int v : graph.get(u)) {

                if (!visited[v]) {

                    visited[v] = true;
                    queue.offer(v);
                }
            }
        }

        return visited;
    }

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        List<List<Integer>> graph = buildGraph(n, invocations);

        boolean[] suspicious = bfs(graph, n, k);

        // Check if any non-suspicious method invokes a suspicious one
        for (int[] edge : invocations) {

            int u = edge[0];
            int v = edge[1];

            if (!suspicious[u] && suspicious[v]) {

                List<Integer> ans = new ArrayList<>();

                for (int i = 0; i < n; i++)
                    ans.add(i);

                return ans;
            }
        }

        // Remove all suspicious methods
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (!suspicious[i])
                ans.add(i);
        }

        return ans;
    }
}