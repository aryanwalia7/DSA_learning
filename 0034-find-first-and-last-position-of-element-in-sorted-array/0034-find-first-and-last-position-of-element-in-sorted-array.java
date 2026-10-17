class Solution {
    public int first(int [] a,int t){
        int n=a.length;
        int low=0;
        int high=n-1;
        int res=-1;
        while(low<=high){
            int m=(low+high)/2;
            if(a[m]==t){
                res=m;
                high=m-1;
            }else if(a[m]<t){
                low=m+1;
            }else{
                high=m-1;
            }
        }
        return res;
    }
    public int last(int [] a,int t){
        int n=a.length;
        int low=0;
        int high=n-1;
        int res=-1;
        while(low<=high){
            int m=(low+high)/2;
            if(a[m]==t){
                res=m;
                low=m+1;
            }else if(a[m]>t){
                high=m-1;
            }else{
                low=m+1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int low=first(nums,target);
        int high=last(nums,target);
        return new int[]{low,high};
    }
}