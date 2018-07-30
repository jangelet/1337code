1
/**
2
 * Definition for a binary tree node.
3
 * public class TreeNode {
4
 *     int val;
5
 *     TreeNode left;
6
 *     TreeNode right;
7
 *     TreeNode(int x) { val = x; }
8
 * }
9
 */
10
class Solution {
11
    public TreeNode invertTree(TreeNode root) {
12
        if(root == null) return null;
13
        Queue<TreeNode> track = new LinkedList<>();
14
        TreeNode curr = root;
15
        track.add(curr);
16
        
17
        while(!track.isEmpty()){
18
            curr = track.poll();
19
            TreeNode temp = curr.left;
20
            curr.left = curr.right;
21
            curr.right = temp;
22
            if(curr.left != null) track.add(curr.left);
23
            if(curr.right != null) track.add(curr.right);
24
        }
25
        return root;
26
    }
27
}
