class Solution {
    public String maximumNumber(String num, int[] change) {
        StringBuilder sb=new StringBuilder(num);
        boolean s=false;
        for(int i=0;i<num.length();i++){
            int c=num.charAt(i)-'0';
            if(!s){
                if(c<change[c]){
                    s=true;
                    c=change[c];
                    sb.setCharAt(i,(char)(c+'0'));
                }
            }else{
                if(change[c]>=c){
                    c=change[c];
                    sb.setCharAt(i,(char)(c+'0'));
                }else{
                    break;
                }
            }
        }
        return sb.toString();
    }
}