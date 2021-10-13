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
    private int max;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }
    
    public int dfs(TreeNode root){
        if(root==null){
            return 0;  
        }
        int leftCount=dfs(root.left);
        int rightCount=dfs(root.right);
        max=Math.max(max,leftCount+rightCount);
        return Math.max(leftCount,rightCount)+1;
        
    }
}