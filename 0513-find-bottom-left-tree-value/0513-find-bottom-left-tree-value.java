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
    public int findBottomLeftValue(TreeNode root) {
        
        if(root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>() ;
        q.offer(root) ;
        int ans = root.val ;

        while (!q.isEmpty()) {
            int size = q.size() ;
 
            for (int i=0 ; i < size ; i++) {
                TreeNode nd = q.poll() ;
               
               if ( i == 0 ) {
                    ans = nd.val ;
               }


                if(nd.left != null) q.offer(nd.left) ;
                if(nd.right != null) q.offer(nd.right) ;
            }
           
        }
         return ans ;
    }
}