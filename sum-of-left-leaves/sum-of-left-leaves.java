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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        return dfs(root.left,true)+dfs(root.right,false);
         
    }
    public int dfs(TreeNode root, boolean isLeft){
        if(root==null){
            return 0;
        }
        else if(isLeft && root.left==null && root.right==null){
            return root.val;
        }
        return dfs(root.left, true)+dfs(root.right, false);
    }
}