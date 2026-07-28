class Solution {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            src=s;
            dest=d;
        }
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Edge>[] graph=new ArrayList[numCourses];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];

            graph[v].add(new Edge(v,u));
        }
        return df(graph);
    }
    public void caldeg(ArrayList<Edge>[] graph,int[] arr){
        for(int i=0;i<graph.length;i++){
            int v=i;
            for(int j=0;j<graph[v].size();j++){
                Edge e=graph[v].get(j);
                arr[e.dest]++;
            }
        }
    }
    public int[] df(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        int deg[]=new int[graph.length];
        ArrayList<Integer> ans=new ArrayList<>();
        caldeg(graph,deg);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<deg.length;i++){
            if(deg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int curr=q.remove();
            ans.add(curr);
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                deg[e.dest]--;
                if(deg[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
        if(ans.size() != graph.length){
            return new int[0];
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}