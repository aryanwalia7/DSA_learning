/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void p(TreeNode root,int sum,int tar,ArrayList<Integer> diary){
        if(root==null)return;
        sum+=root.val;
        diary.add(root.val);
        if(root.left==null&&root.right==null){
            if(sum==tar){
                ans.add(new ArrayList<>(diary));
                diary.remove(diary.size()-1);
                return;
            }
        }
        p(root.left,sum,tar,diary);
        p(root.right,sum,tar,diary);
        diary.remove(diary.size()-1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null)return ans;
        ArrayList<Integer> diary=new ArrayList<>();
        p(root,0,targetSum,diary);
        return ans;
    }
}