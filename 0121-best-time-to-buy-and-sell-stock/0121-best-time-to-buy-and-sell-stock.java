class Solution {
    public int maxProfit(int[] prices) {
        int mp=0;
        int bp=prices[0];
        for(int i=1;i<prices.length;i++){
            if(bp<prices[i]){
                int p=prices[i]-bp;
                mp=Math.max(p,mp);
            }else{
                bp=prices[i];
            }
            
        }
        return mp;
    }
}