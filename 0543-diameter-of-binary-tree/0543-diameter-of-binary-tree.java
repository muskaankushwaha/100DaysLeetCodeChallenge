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
    // int max=-1;
    // public int height(TreeNode root){
    //     if(root==null)return 0;
    //     return Math.max(height(root.left)+1,height(root.right)+1);
    // }
    // public int diameterOfBinaryTree(TreeNode root) {
    //     if(root==null)return 0;
    //     int lh=height(root.left);
    //     int rh=height(root.right);
    //     max=Math.max(max,lh+rh);
    //     diameterOfBinaryTree(root.left);
    //     diameterOfBinaryTree(root.right);
    //     return max;
    //now optimize in O(N);
    int max=-1;
    public int height(TreeNode root){
        if(root==null)return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        max=Math.max(max,lh+rh);
        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
    }
}