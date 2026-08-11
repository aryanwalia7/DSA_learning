class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int dup[]=Arrays.copyOf(arr,arr.length);
        Arrays.sort(dup);
        int rank=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int key=0;key<dup.length;key++){
            if(!map.containsKey(dup[key])){
                map.put(dup[key],rank);
                rank++;
            }
        }
        int res[]=new int[arr.length];
        for(int i=0;i<res.length;i++){
            res[i]=map.get(arr[i]);
        }
        return res;
    }
}