class Solution {
    public int find(int arr[]){
        int c=-1;
        for(int i=0;i<arr.length;i++){
            c=Math.max(arr[i],c);
        }
        return c;

    }
    public int longestOnes(int[] nums, int k) {
        int arr[]=new int[2];
        int low=0;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            int max=find(arr);
            int len=i-low+1;
            int zeros=arr[0];
           
            while(zeros>k){
                arr[nums[low]]--;
                low++;
                max=find(arr);
                len=i-low+1;
                zeros=arr[0];
            }
            len=i-low+1;
            res=Math.max(res,len);
        }
        return res;
    }
}