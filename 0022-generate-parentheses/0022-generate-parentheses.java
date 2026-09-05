class Solution {
    public void gp(int n,int open,int close,StringBuilder s,ArrayList<String> diary){
        if(open==n&&close==n){
            diary.add(s.toString());
            return;
        }
        if(open<n){
            s.append("(");
            gp(n,open+1,close,s,diary);
            s.deleteCharAt(s.length()-1);
        }
        if(close<open){
            s.append(")");
            gp(n,open,close+1,s,diary);
            s.deleteCharAt(s.length()-1);
        }
        return;
    }
    public List<String> generateParenthesis(int n) {
         ArrayList<String> diary = new ArrayList<>();
        StringBuilder s = new StringBuilder();

        gp(n, 0, 0, s, diary);

        return diary;
    }
}