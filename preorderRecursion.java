class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }
    
    private void preorderHelper(TreeNode root, ArrayList<Integer> alist){
        if(root != null){
            alist.add(root.val);
            preorderHelper(root.left, alist);
            preorderHelper(root.right, alist);
        }
        return;
    }
}