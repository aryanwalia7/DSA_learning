class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftm[]=new int[n];
        int rightm[]=new int[n];
        leftm[0]=height[0];
        rightm[n-1]=height[n-1];

        for(int i=1;i<leftm.length;i++){
            leftm[i]=Math.max(height[i],leftm[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rightm[i]=Math.max(height[i],rightm[i+1]);
        }
        int tp=0;
        for(int i=0;i<n;i++){
            int min=Math.min(leftm[i],rightm[i]);
            tp+=min-height[i];
        }
        return tp;

    }
}