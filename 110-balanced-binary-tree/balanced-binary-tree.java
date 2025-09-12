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
    public boolean isBalanced(TreeNode root) {
           if(root==null){
            return true;
           }

           int lefth=checkBalanced(root.left);
           int righth=checkBalanced(root.right);

           if(lefth==-1 || righth==-1){
                return false;
           }
           if(Math.abs(lefth-righth)>1){
            return false;
           }

           return isBalanced(root.left) && isBalanced(root.right);
    }
    public static int checkBalanced(TreeNode root){
             if(root==null){
                return 0;
             }

             int left=checkBalanced(root.left);
             int right=checkBalanced(root.right);

             return Math.max(left,right)+1;
    }
}