class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int low=0;
        int hi=n-1;
        int res=-1;
        while(low<=hi){
            int g=(low+hi)/2;
            if(arr[g]<arr[g+1]){
                low=g+1;
            }else{
                res=g;
                hi=g-1;
            }
        }
        return res;
    }
}