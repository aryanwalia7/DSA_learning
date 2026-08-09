class Solution {
    public int pivotIndex(int[] nums) {
        int i=0;
        
        while(i<nums.length){
            int lsum = 0;
            int rsum = 0;
            for(int j=0;j<i;j++) lsum+=nums[j];
            for(int k=i+1;k<nums.length;k++) rsum+=nums[k];
            if(lsum==rsum) return i;
            i++;
        }
        return -1;
    }
}