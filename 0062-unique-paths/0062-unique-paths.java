class Solution {
    public int up(int i,int j,int n,int m,int dp[][]){
        if(i==n-1&&j==m-1)return 1;
        if(i<0||i>=n||j<0||j>=m)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        return dp[i][j]=up(i+1,j,n,m,dp)+up(i,j+1,n,m,dp);

    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return up(0,0,n,m,dp);
    }
}