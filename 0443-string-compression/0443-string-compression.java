class Solution {
    public int compress(char[] chars) {
        int w=0;
        for(int i=0;i<chars.length;i++){
            int co=1;
            char curr=chars[i];
            while(i<chars.length-1 &&chars[i]==chars[i+1]){
                co++;
                i++;
            }
            chars[w++]=curr;
            if(co>1){
                String s=String.valueOf(co);
                for(char c:s.toCharArray()){
                    chars[w++]=c;
                }
            }
        }
        return w;
    }
}