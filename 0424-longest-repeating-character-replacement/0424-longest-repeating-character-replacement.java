class Solution {
    public int find(int arr[]){
        int count=-1;
        for(int i=0;i<arr.length;i++){
            count=Math.max(arr[i],count);
        }
        return count;
    }
    public int characterReplacement(String s, int k) {
        int freq[]=new int[256];
        int low=0;
        int res=Integer.MIN_VALUE;
        for(int high=0;high<s.length();high++){
            freq[s.charAt(high)]++;
            int max=find(freq);
            int len=high-low+1;
            int diff=len-max;
            while(diff>k){
                freq[s.charAt(low)]--;
                low++;
                max=find(freq);
                len=high-low+1;
                diff=len-max;
               
            }
            len=high-low+1;
            res=Math.max(len,res);
        }
        return res;
    }
}