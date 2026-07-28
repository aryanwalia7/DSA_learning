class Solution {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            src=s;
            dest=d;
        }
    }
    public void caldeg(ArrayList<Edge> [] g,int [] arr){
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[i].size();j++){
                Edge e=g[i].get(j);
                arr[e.dest]++;
            }
        }
    }
    public boolean tp(ArrayList<Edge> g[]){
        int deg[]=new int[g.length];
        caldeg(g,deg);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<deg.length;i++){
            if(deg[i]==0){
                q.add(i);
            }
        }
        int processed=0;
        while(!q.isEmpty()){
            int curr=q.remove();
            processed++;
            for(int i=0;i<g[curr].size();i++){
                Edge e=g[curr].get(i);
                deg[e.dest]--;
                if(deg[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
        return processed==g.length;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Edge> [] g=new ArrayList[numCourses];
        for(int i=0;i<g.length;i++){
            g[i]=new ArrayList<>();
        } 
        for(int i=0;i< prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            g[v].add(new Edge(v,u));
        }
        return tp(g);
    }
}