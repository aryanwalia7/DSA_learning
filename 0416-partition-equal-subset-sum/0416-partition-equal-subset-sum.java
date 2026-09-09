class Solution {
    public boolean p(int[] nums,int n,int i,int s,Boolean dp[][]){
        if(s==0)return true;
        if(i==n)return false;
        if(dp[i][s]!=null){
            return dp[i][s];
        }
        if(nums[i]<=s){
           return dp[i][s]= (p(nums,n,i+1,s-nums[i],dp)|| p(nums,n,i+1,s,dp));
        }
        return dp[i][s]=p(nums,n,i+1,s,dp);
    }
    public boolean canPartition(int[] nums) {
        int tsum=0;
        for(int i=0;i<nums.length;i++){
            tsum+=nums[i];
        }
        
        if(tsum%2!=0) return false;
        int sum=tsum/2;
        Boolean dp[][]=new Boolean [nums.length][sum+1];
       
        return p(nums,nums.length,0,sum,dp);
    }
}