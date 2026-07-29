class Solution {
    public String maximumNumber(String num, int[] change) {
        StringBuilder sb= new StringBuilder(num);
        boolean si=false;
        for(int i=0;i<num.length();i++){
            int s=num.charAt(i)-'0';
            if(!si){
                if(s<change[s]){
                    si=true;
                    s=change[s];
                    sb.setCharAt(i,(char)(s+'0'));
                }
            }    
                else{
                    if(change[s]>=s){
                        s=change[s];
                        sb.setCharAt(i,(char)(s+'0'));
                    }else{
                        break;
                    }
                }
        }
        return sb.toString();
    }
}