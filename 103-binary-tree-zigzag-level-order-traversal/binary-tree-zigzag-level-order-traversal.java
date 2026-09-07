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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>() ;

        if(root == null)  return ans ;
        Queue<TreeNode> q = new LinkedList<>() ;
        q.offer(root) ;
        int  levelCnt = 0 ;

        while (!q.isEmpty()) {
            int size = q.size() ;
   
            List<Integer> list = new ArrayList<>() ;
           for(int i = 0 ; i < size ; i++) {
                TreeNode nd = q.poll() ;
                list.add(nd.val) ;

                if(nd.left != null)  q.offer(nd.left) ;
                if(nd.right != null) q.offer(nd.right) ;               
           }
             
              if( levelCnt % 2 != 0) {
                  Collections.reverse(list) ;
                }
                
              ans.add(list) ;
              levelCnt++ ;
        }
          return ans ;
    }
}