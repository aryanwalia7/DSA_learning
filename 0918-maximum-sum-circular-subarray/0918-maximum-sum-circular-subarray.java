class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int bm=nums[0];
        int bn=nums[0];
        int res1=nums[0];
        int res2=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=1;i<nums.length;i++){
            int v1=bm+nums[i];
            int v2=bn+nums[i];
            int v3=nums[i];
            bm=Math.max(v1,v3);
            bn=Math.min(v2,v3);
            res1=Math.max(res1,bm);
            res2=Math.min(res2,bn);
        }
        if(res1<0)return res1;
        return Math.max(res1,(sum-res2));
    }
}