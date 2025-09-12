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
    public boolean isSymmetric(TreeNode root) {
          if(root==null){
            return true;
          }
          return isMirror(root.left,root.right);
    }
    public static boolean isMirror(TreeNode lefts,TreeNode rights){
             if(lefts==null && rights==null){
                return true;
             }

             if(lefts==null || rights==null){
                return false;
             }
             if(lefts.val!=rights.val){
                return false;
             }

             return isMirror(lefts.left,rights.right) && isMirror(lefts.right,rights.left);
    }
   
}