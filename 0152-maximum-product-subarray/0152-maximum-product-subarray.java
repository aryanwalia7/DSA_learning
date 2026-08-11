class Solution {
    public int maxProduct(int[] nums) {
        int pos=nums[0];
        int neg=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            int pos1=Math.max(nums[i],Math.max(nums[i]*pos,nums[i]*neg));
            int neg1=Math.min(nums[i],Math.min(nums[i]*pos,nums[i]*neg));
            pos=pos1;
            neg=neg1;
            max=Math.max(max,pos);
        }
        return max;
    }
}