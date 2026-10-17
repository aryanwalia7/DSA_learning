class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0;
        int hi=n-1;
        int res=nums[n-1];
        while(low<=hi){
            int m=(low+hi)/2;
            if(nums[m]>=nums[n-1]){
                low=m+1;
            }else{
                res=nums[m];
                hi=m-1;
            }
        }
        return res;
    }
}