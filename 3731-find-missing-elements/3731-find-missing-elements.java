class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        int n=nums.length;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]<low){
                low=nums[i];
            }if(nums[i]>high){
                high=nums[i];
            }
        }
        HashSet<Integer> s=new HashSet<>();
        for(int n1:nums){
            s.add(n1);
        }
        for(int i=low;i<=high;i++){
            if(!s.contains(i)) ans.add(i);
        }
       return ans;
    }
}