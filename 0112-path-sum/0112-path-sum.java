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
    boolean res=false;
    public void fun(TreeNode root,int sum,int tar){
        if(root==null)return;
        sum+=root.val;
        if(root.left==null&&root.right==null){
            if(sum==tar){
                res=true;
                return;
            }
        }
        fun(root.left,sum,tar);
        fun(root.right,sum,tar);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        fun(root,0,targetSum);
        return res;
        
        
    }
}