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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>() ;

        if (root == null) return ans ;

        Queue<TreeNode> q = new LinkedList<>() ;
        q.offer(root) ;
        
        while (!q.isEmpty()) {
            int size = q.size() ;

            List<Integer> level = new ArrayList<>() ;

            for (int i = 0 ; i< size ; i++) {
                TreeNode nd = q.poll() ;
                level.add(nd.val) ;

                if (i == size-1) 
                  ans.add(nd.val) ;

              if (nd.left != null) {
                    q.offer(nd.left);
                }

                if (nd.right != null) {
                    q.offer(nd.right);
                }
            }
              
        }
         return ans ;
    }
}