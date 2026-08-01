class Solution {
    static class Edge{
        int src;
        int dest;
        int w;

        public Edge(int s,int d,int w){
            src=s;
            dest=d;
            this.w=w;
        }
    }

    static class Info{
        int n;
        int cost;
        int stops;

        public Info(int n,int c,int s){
            this.n=n;
            cost=c;
            stops=s;
        }
    }

    public static void createGraph(int f[][], ArrayList<Edge>[] g){
        for(int i=0;i<g.length;i++){
            g[i]=new ArrayList<>();
        }

        for(int i=0;i<f.length;i++){
            int u=f[i][0];
            int v=f[i][1];
            int w=f[i][2];
            g[u].add(new Edge(u,v,w));
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        ArrayList<Edge>[] g=new ArrayList[n];
        createGraph(flights,g);

        int dis[]=new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[src]=0;

        Queue<Info> q=new LinkedList<>();
        q.add(new Info(src,0,0));

        while(!q.isEmpty()){

            int size=q.size();
            int temp[]=dis.clone();

            while(size-->0){

                Info curr=q.remove();

                if(curr.stops>k)
                    continue;

                for(int i=0;i<g[curr.n].size();i++){

                    Edge e=g[curr.n].get(i);
                    int u=e.src;
                    int v=e.dest;
                    int w=e.w;

                    if(dis[u]!=Integer.MAX_VALUE &&
                       dis[u]+w<temp[v] &&
                       curr.stops<=k){

                        temp[v]=dis[u]+w;
                        q.add(new Info(v,temp[v],curr.stops+1));
                    }
                }
            }

            dis=temp;
        }

        return dis[dst]==Integer.MAX_VALUE ? -1 : dis[dst];
    }
}