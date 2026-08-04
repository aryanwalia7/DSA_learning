class Solution {
    public int lengthOfLastWord(String s) {
        int co=0;
        String c=s.trim();
        int i=c.length()-1;
        while(i>=0&&c.charAt(i)!=' '){
            co++;
            i--;
        }
        return co;
    }
}