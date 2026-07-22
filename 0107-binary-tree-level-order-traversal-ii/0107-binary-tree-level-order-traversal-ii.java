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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelOb= new LinkedList<>();

        Queue <TreeNode> que=new LinkedList<>();
        if(root ==null)return levelOb;
        que.add(root);
        while(!que.isEmpty()){
            int levelnum=que.size();
            List<Integer> sublist=new LinkedList<>();
            for(int i=0; i<levelnum; i++){
                 if(que.peek().left!=null){
                    que.add(que.peek().left);
                }
                if(que.peek().right!=null){
                    que.add(que.peek().right);
                }sublist.add(que.poll().val); 
            }levelOb.add(0,sublist);
        }return levelOb;
    }
}