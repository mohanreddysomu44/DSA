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
      TreeNode first=null;
      TreeNode second=null;
      TreeNode prev=new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        
        correctTree(root);
         if(first!=null && second!=null){
             int temp=first.val;
             first.val=second.val;
             second.val=temp;
         }
        
    }
    public void correctTree(TreeNode root){
           if(root==null) return;

           correctTree(root.left);
           if(prev!=null && prev.val>root.val){
               if(first==null){
                first=prev;
               }
               second=root;
           }
           prev=root;
           correctTree(root.right);
    }
}