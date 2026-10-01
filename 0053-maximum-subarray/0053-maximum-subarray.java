class Solution {
    public int maxSubArray(int[] nums) {
        int be=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            int p=be;
            int v1=p+nums[i];
            int v2=nums[i];
            be=Math.max(v1,v2);
            res=Math.max(res,be);
        }
        return res;
    }
}