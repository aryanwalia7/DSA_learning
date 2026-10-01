class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int bm=nums[0];
        int bn=nums[0];
        int res1=nums[0];
        int res2=nums[0];
        for(int i=1;i<nums.length;i++){
            int pm=bm;
            int pn=bn;
            int v1=pm+nums[i];
            int v2=pn+nums[i];
            int v3=nums[i];
            bm=Math.max(v1,v3);
            bn=Math.min(v2,v3);
            res1=Math.max(res1,bm);
            res2=Math.min(res2,bn);
        }
        return Math.max(Math.abs(res1),Math.abs(res2));

    }
}