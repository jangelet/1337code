/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        TreeNode curr = root;
        Stack<TreeNode> tracker = new Stack<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
 
        while(curr != null || !tracker.isEmpty()){
            while(curr != null){
                tracker.push(curr);
                curr = curr.left;
            }
            curr = tracker.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) >= list.get(i+1)) return false;
        }
        
        return true;
    }
}