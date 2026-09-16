/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans;
    public int lca(TreeNode root, TreeNode p, TreeNode q){
        if(root==null)return 0;
        int left=lca(root.left,p,q);
        int right=lca(root.right,p,q);
        int self=0;
        if(root==p||root==q)self=1;
        int total=self+left+right;
        if(total==2&&ans==null){
            ans=root;
        }
        return total;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a=lca(root,p,q);
        return ans;
    }
}