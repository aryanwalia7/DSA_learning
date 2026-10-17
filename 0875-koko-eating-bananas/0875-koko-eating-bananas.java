class Solution {
    public long hrs(int [] a,int n,int h){
        long res=0;
        for(int i=0;i<a.length;i++){
            res+=a[i]/h;
            if(a[i]%h!=0)res++;
        }
        return res;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int hi=piles[0];
        int res=-1;
        for (int i = 1; i < piles.length; i++) {
            hi = Math.max(hi, piles[i]);
        }
        while(low<=hi){
            int g=(low+hi)/2;
            if(hrs(piles,piles.length,g)<=h){
                res=g;
                hi=g-1;
            }else{
                low=g+1;
            }
        }
        return res;
      
       
    }
}