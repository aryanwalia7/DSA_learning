class Solution {
    public int maxProduct(int[] nums) {
        int pos=nums[0];
        int neg=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            int npos=Math.max(nums[i],Math.max(nums[i]*pos,nums[i]*neg));
            int nneg=Math.min(nums[i],Math.min(nums[i]*pos,nums[i]*neg));

            pos=npos;
            neg=nneg;
            max=Math.max(pos,max);
        }
        return max;
    }
}