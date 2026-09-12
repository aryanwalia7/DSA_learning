class Solution {
    public int lis(int [] nums,int n,int i,int prev,int dp[][]){
        if(i==n)return 0;
        if(dp[i][prev+1]!=-1)return dp[i][prev+1];
        int a=0;
        if(prev==-1||nums[i]>nums[prev]){
            a=1+lis(nums,n,i+1,i,dp);
            
        }
        
        int b=lis(nums,n,i+1,prev,dp);
        return dp[i][prev+1]= Math.max(a,b);
    }
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int[nums.length+1][nums.length+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return lis(nums,nums.length,0,-1,dp);
    }
}