class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        
        HashSet<List<Integer>> s=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
           while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> l= new ArrayList<>();
                    l.add(nums[i]);l.add(nums[left]);l.add(nums[right]);
                    s.add(l);
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }         
            }
        }
        for(List<Integer> l:s){
            ans.add(l);
        }
        return ans;
    }
}