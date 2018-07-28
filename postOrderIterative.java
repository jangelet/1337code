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

    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        Stack<TreeNode> track = new Stack<>();
        TreeNode curr = root; 
       
        while(curr != null || !track.isEmpty()){
            if(curr != null){
                track.push(curr);
                result.addFirst(curr.val);
                curr = curr.right;
            }else{
                curr = track.pop();
                curr = curr.left;
            }
        }
        return result;
    }
    
    
    
    // private void postOrder(TreeNode root, ArrayList<Integer> list){
    //     if(root == null){
    //         return;
    //     }
    //     postOrder(root.left, list);
    //     postOrder(root.right, list);
    //     list.add(root.val);
    // }
}