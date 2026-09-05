class Solution {
    public void cs(int[] c,int i,int sum,ArrayList<Integer> ans,List<List<Integer>> res,int target){
        if(sum==target){
            res.add(new ArrayList<>(ans));
            return;
        }
        if(i==c.length){
            return;
        }
        cs(c,i+1,sum,ans,res,target);
        if(sum+c[i]<=target){
            ans.add(c[i]);
            sum+=c[i];
            cs(c,i,sum,ans,res,target);
            ans.remove(ans.size()-1);
            sum-=c[i];
        }
        return;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        cs(candidates, 0, 0, ans, res, target);

        return res;
    }
}