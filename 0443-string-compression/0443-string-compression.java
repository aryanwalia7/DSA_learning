class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=0;
        while(i<chars.length){
            char curr=chars[i];
            int count=1;
            while(i<chars.length-1&&chars[i]==chars[i+1]){
                count++;
                i++;
            }
            chars[j++]=curr;
            if(count>1){
                String s=Integer.toString(count);
                for(char c:s.toCharArray()){
                    chars[j++]=c;
                }
            }
            i++;
        }
        return j;
    }
}