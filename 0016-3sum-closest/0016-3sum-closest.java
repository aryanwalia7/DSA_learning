class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int md=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            int sum=target-nums[i];

            while(left<right){
                int s=nums[left]+nums[right];
                int diff=Math.abs(s-sum);
                if(diff<md){
                    md=diff;
                    res=s+nums[i];
                }if(s==sum){
                    return s+nums[i];
                }else if(s<sum) left++;
                else right--;
            }
        }
        return res;
    }
}