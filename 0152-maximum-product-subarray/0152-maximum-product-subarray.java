class Solution {
    public int maxProduct(int[] nums) {
        int bmxe=nums[0];
        int bmne=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            int pmx=bmxe;
            int pnx=bmne;
            int v1=pmx*nums[i];
            int v2=pnx*nums[i];
            int v3=nums[i];
            bmxe=Math.max(v3,Math.max(v1,v2));
            bmne=Math.min(v3,Math.min(v1,v2));
            res=Math.max(res,Math.max(bmxe,bmne));
        }
        return res;
    }
}