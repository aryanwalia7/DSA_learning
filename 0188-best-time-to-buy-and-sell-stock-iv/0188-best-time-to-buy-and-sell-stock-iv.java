class Solution {
    public int mp(int p[],int n,int i,int k,int dp[][]){
        if(i==n||k==0)return 0;
        if(dp[i][k]!=-1){
            return dp[i][k];
        }
        if(k%2==0){
            int a=mp(p,n,i+1,k-1,dp)-p[i];
            int b=mp(p,n,i+1,k,dp);
            return dp[i][k]=Math.max(a,b);
        }else{
            int a=mp(p,n,i+1,k-1,dp)+p[i];
            int b=mp(p,n,i+1,k,dp);
            return dp[i][k]=Math.max(a,b);
        }
    }
    public int maxProfit(int k, int[] prices) {
        int k1=k*2;
        int dp[][]=new int[prices.length+1][k1+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return mp(prices,prices.length,0,k1,dp);
    }
}