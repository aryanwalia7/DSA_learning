class Solution {
    public int mp(int arr[],int n,int i,int k,int dp[][]){
        if(i==n)return 0;
        if(k==0)return 0;
        if(dp[i][k]!=-1)return dp[i][k];
        if(k%2==0){
            int a=mp(arr,n,i+1,k-1,dp)-arr[i];
            int b=mp(arr,n,i+1,k,dp);
            return dp[i][k]=Math.max(a,b);
        }else{
            int a=mp(arr,n,i+1,k-1,dp)+arr[i];
            int b=mp(arr,n,i+1,k,dp);
            return dp[i][k]=Math.max(a,b);
        }
    }
    public int maxProfit(int[] prices) {
        int k=4;
        int dp[][]=new int[prices.length+1][k+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return mp(prices,prices.length,0,4,dp);
    }
}