class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int md=Integer.MAX_VALUE;
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int s=nums[i]+nums[left]+nums[right];
                int diff=Math.abs(s-target);
                if(diff<md){
                    md=diff;
                    ans=s;
                }
                if(s<target){
                    left++;
                }else if(s>target){
                    right--;
                }else{
                    return s;
                }
                
            }
        }
        return ans;
    }
}