class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        int i=0;
        int l=0;
        for(i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int k=i;k<arr.length;k++){
            arr[k]=nums2[l++];
        }
        Arrays.sort(arr);
        int n=arr.length;
        
        if(n%2==0){
            return (arr[n/2 - 1] + arr[n/2]) / 2.0;
        }else{
            return arr[n/2];
        }
        
        
       
    }
}