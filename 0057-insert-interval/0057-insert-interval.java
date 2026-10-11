class Solution {
    public int[][] na(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals,(x,y)->Integer.compare(x[0],y[0]));
        List<int[]> res=new ArrayList<>();
        boolean insert=false;
        for(int i=0;i<intervals.length;i++){
            if(insert==false&&intervals[i][0]>=newInterval[0]){
                res.add(newInterval);
                insert=true;
            }
            res.add(intervals[i]);
        }
        if (!insert) {
            res.add(newInterval);
        }
        return res.toArray(new int[res.size()][]);
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
       int[][] a=na(intervals,newInterval);
       List<int[]> res=new ArrayList<>();
       int s1=a[0][0];
       int e1=a[0][1];
       for(int i=1;i<a.length;i++){
        int s2=a[i][0];
        int e2=a[i][1];
        if(e1>=s2){
            e1=Math.max(e1,e2);
            continue;
        }
        res.add(new int[]{s1,e1});
        s1=s2;
        e1=e2;
       }
       res.add(new int[]{s1,e1});
       return res.toArray(new int[res.size()][]);
    }
}