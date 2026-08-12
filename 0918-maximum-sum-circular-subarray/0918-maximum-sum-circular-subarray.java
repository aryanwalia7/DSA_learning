class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int cma=0;
        int cmi=0;
        int total=0;
        for(int i=0;i<nums.length;i++){
            cma+=nums[i];
            max=Math.max(max,cma);
            if(cma<0) cma=0;
            cmi+=nums[i];
            min=Math.min(min,cmi);
            if(cmi>0) cmi=0;
            total+=nums[i];
            
       
        }
        if(max<0){
                return max;
            }
        return Math.max(max,total-min);
    }
}