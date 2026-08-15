class Solution {
    public int totalFruit(int[] fruits) {
        int low=0;
        int res=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<fruits.length;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while(map.size()>2){
                map.put(fruits[low],map.get(fruits[low])-1);
                if(map.get(fruits[low])==0) map.remove(fruits[low]);
                low++;
            }
            int len=i-low+1;
            res=Math.max(res,len);
        }
        return res;
    }
}