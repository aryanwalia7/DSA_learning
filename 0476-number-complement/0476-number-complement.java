class Solution {
    public int findComplement(int num) {
        StringBuilder sb= new StringBuilder();
        int n1=Integer.numberOfLeadingZeros(num);
        String n=Integer.toBinaryString(num);
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            if(c=='0'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        return Integer.parseInt(sb.toString(),2);
    }
}