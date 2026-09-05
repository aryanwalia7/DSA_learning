class Solution {
    public int hr(int arr[],int n,int i,int free,int dp[][]){
        if(i==n) return 0;
        if(dp[i][free]!=-1){
            return dp[i][free];
        }
        if(free==0){
            return dp[i][free]=hr(arr,n,i+1,1,dp);
        }
        int c1=hr(arr,n,i+1,1,dp);
        int c2=arr[i]+hr(arr,n,i+1,0,dp);
        return dp[i][free]=Math.max(c1,c2);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }
        return hr(nums,n,0,1,dp);
    }
}