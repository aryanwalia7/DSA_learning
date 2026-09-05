class Solution {
    
    public void lc(String d,int i,StringBuilder s,ArrayList<String> diary,HashMap<Character,String>f){
        if(i==d.length()){
            diary.add(s.toString());
            return;
        }
        String ans=f.get(d.charAt(i));
        for(int j=0;j<ans.length();j++){
            s.append(ans.charAt(j));
            lc(d,i+1,s,diary,f);
            s.deleteCharAt(s.length()-1);
        }
        return;


    }

    public List<String> letterCombinations(String digits) {
        ArrayList<String> diary = new ArrayList<>();

        if (digits.length() == 0) {
            return diary;
        }
        HashMap<Character,String> f= new HashMap<>();
        f.put('2',"abc");
        f.put('3',"def");
        f.put('4',"ghi");
        f.put('5',"jkl");
        f.put('6',"mno");
        f.put('7',"pqrs");
        f.put('8',"tuv");
        f.put('9',"wxyz");
        StringBuilder s = new StringBuilder();

        lc(digits, 0, s, diary, f);

        return diary;



    }
}