class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int low=0;
        int maxl=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.get(s.charAt(i))>2){
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
                if(map.get(s.charAt(low))==0) map.remove(s.charAt(low));
                
                
                low++;
                
            }
            int len=i-low+1;
            maxl=Math.max(len,maxl);
           
        }
        return maxl;
    }
}