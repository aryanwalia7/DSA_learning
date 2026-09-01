class Solution {
    public int removeDuplicates(int[] nums) {
        int r=1;
        int low=0;
        int high=1;
        while(high<nums.length){
            if(nums[high]==nums[low]){
                high++;
                continue;
            }
            nums[low+1]=nums[high];
            high++;
            r++;
            low++;
        }
        return r;
    }
}