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
    TreeNode gf1=null;TreeNode gf2=null;TreeNode gs1=null;TreeNode gs2=null;
    int g=0;
    TreeNode prev=null;
    public void rt(TreeNode root){
        if(root==null)return;
        rt(root.left);
        if(prev==null){
            prev=root;
        }else{
            if(root.val<=prev.val){
                if(g==0){
                    gf1=prev;
                    gf2=root;
                    g++;
                }else{
                    gs1=prev;
                    gs2=root;
                    g++;
                }
            }
            prev=root;
        }
        rt(root.right);

    }
    public void recoverTree(TreeNode root) {
        if(root==null)return;
        rt(root);
        if(g==0)return;
        else if(g==1){
            int temp=gf1.val;
            gf1.val=gf2.val;
            gf2.val=temp;

        }else{
            int temp=gf1.val;
            gf1.val=gs2.val;
            gs2.val=temp;
        }
    }
}