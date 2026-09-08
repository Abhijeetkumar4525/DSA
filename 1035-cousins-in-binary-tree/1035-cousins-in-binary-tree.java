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
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null)  return false ;

        Queue<TreeNode> q = new LinkedList<>() ;
        q.offer(root) ;
        int childCnt = 0;

        while (!q.isEmpty()) {
            int size = q.size() ;

            for (int i =0 ; i < size ; i++) {
                TreeNode nd = q.poll() ;
                int sameParentCnt = 0 ;


                if(nd.left != null) {
                    if (nd.left.val == x || nd.left.val == y) {
                        sameParentCnt++ ;
                        childCnt++;
                    }
                    q.offer(nd.left) ;
                } 

                 if(nd.right != null) {
                     if (nd.right.val == x || nd.right.val == y) {
                        sameParentCnt++ ;
                        childCnt++;
                    }
                    q.offer(nd.right) ;
                } 
                if (sameParentCnt == 2) 
                    return false ;
            }

            if(childCnt == 2) {
                return true ;
            }
            if(childCnt == 1) {
                return false ;
            }
        }
        return false ;
    }
}