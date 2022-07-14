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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        if(root == null) return wrapList;
        queue.offer(root);     // offer() -  inserts the specified element into the queue
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> list = new LinkedList<Integer>();
            for(int i=0;i<level;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);    // peek() - returns the element at the front of the queue
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                list.add(queue.poll().val);    // poll() -  returns and removes the element at the front end of the queue
            }
            wrapList.add(list);
        }
        return wrapList;
    }
}