import java.util.*;

class Solution {

    public int mc(int arr[], int i, int j, int dp[][]) {

        if(i > j) return 0;

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int res = Integer.MAX_VALUE;

        for(int k=i; k<=j; k++) {

            int cost = arr[j+1] - arr[i-1];

            int a = mc(arr, i, k-1, dp);
            int b = mc(arr, k+1, j, dp);

            int r = cost + a + b;

            res = Math.min(res, r);
        }

        return dp[i][j] = res;
    }

    public int minCost(int n, int[] cuts) {

        int n1 = cuts.length;

        Arrays.sort(cuts);

        int arr[] = new int[n1+2];

        arr[0] = 0;

        for(int i=1; i<=n1; i++) {
            arr[i] = cuts[i-1];
        }

        arr[n1+1] = n;

        int dp[][] = new int[n1+2][n1+2];

        for(int i=0; i<dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return mc(arr, 1, n1, dp);
    }
}