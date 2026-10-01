class Solution {
    public int maximumSum(int[] arr) {
        int nd=arr[0];
        int od=0;
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            int pnd=nd;
            int pod=od;
            nd=Math.max(pnd+arr[i],arr[i]);
            od=Math.max(pod+arr[i],pnd);
            res=Math.max(res,Math.max(nd,od));
        }
        return res;
    }
}