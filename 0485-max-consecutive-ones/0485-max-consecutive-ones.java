class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m1=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) c++;
            else c=0;
            m1=Math.max(m1,c);
        }
        return m1;
    }
}