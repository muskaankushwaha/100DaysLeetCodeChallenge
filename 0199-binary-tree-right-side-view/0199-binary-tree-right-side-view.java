class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        fn(root, 0, ans);
        return ans;
    }

    public void fn(TreeNode root, int level, List<Integer> ans){
        if(root == null) return;
        if(level == ans.size()){
            ans.add(root.val);
        }
        fn(root.right, level + 1, ans);
        fn(root.left, level + 1, ans);
    }
}