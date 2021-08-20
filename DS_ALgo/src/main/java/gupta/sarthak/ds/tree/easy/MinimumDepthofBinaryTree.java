package gupta.sarthak.ds.tree.easy;

import java.util.LinkedList;
import java.util.Queue;

/*
*Given a binary tree, find its minimum depth.
*
*The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
* Input: root = [3,9,20,null,null,15,7]
* Output: 2
* The number of nodes in the tree is in the range [0, 105].
* -1000 <= Node.val <= 1000
*
* */

public class MinimumDepthofBinaryTree {

//      Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
    class Solution {
        public int minDepth(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            if(root == null) return 0;
            int c = 1;
            q.add(root);
            while(q.size() > 0){
                int n = q.size();
                for(int i = 0; i < n; i++){
                    TreeNode t = q.poll();
                    if(t.left == null && t.right == null){
                        return c;
                    }
                    if(t.left != null){
                        q.add(t.left);
                    }
                    if(t.right != null){
                        q.add(t.right);
                    }
                }
                c++;
            }
            return c;
        }
    }
}
