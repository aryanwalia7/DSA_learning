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
    public void in(TreeNode root,ArrayList<Integer> ans){
        if(root==null)return;
        in(root.left,ans);
        ans.add(root.val);
        in(root.right,ans);
    }
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        ArrayList<Integer> ans=new ArrayList<>();
        in(root,ans);
        int i=0;
        int j=ans.size()-1;
       while(i<j){
            if(ans.get(i)+ans.get(j)==k)return true;
            else if(ans.get(i)+ans.get(j)<k)i++;
            else j--;
        }
        return false;
    }
}