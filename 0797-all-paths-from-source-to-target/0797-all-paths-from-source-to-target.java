class Solution {

    static class Edge {
        int s;
        int dest;

        public Edge(int s, int d) {
            this.s = s;
            this.dest = d;
        }
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        ArrayList<Edge>[] g = new ArrayList[graph.length];

        for (int i = 0; i < graph.length; i++) {
            g[i] = new ArrayList<>();
        }

        // Convert int[][] to adjacency list
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                g[i].add(new Edge(i, graph[i][j]));
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        ap(g, 0, graph.length - 1, path, ans);

        return ans;
    }

    public void ap(ArrayList<Edge>[] g, int src, int dest,
                   List<Integer> path, List<List<Integer>> ans) {

        path.add(src);

        if (src == dest) {
            ans.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }

        for (int i = 0; i < g[src].size(); i++) {
            Edge e = g[src].get(i);
            ap(g, e.dest, dest, path, ans);
        }

        path.remove(path.size() - 1);
    }
}