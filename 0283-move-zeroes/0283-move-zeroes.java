class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        while(i<nums.length&&j<nums.length){
            if(nums[i]!=0){
                i++;
                if(i<=j) j++;
            }
            else if(nums[j]==0){
                j++;
            }
            else if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            
        }
    }
}