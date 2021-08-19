package gupta.sarthak.ds.tree.easy;

import java.util.LinkedList;
import java.util.Queue;

/*
*Given the root of a binary tree, return its maximum depth.
*A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*Input: root = [3,9,20,null,null,15,7]
*Output: 3
* Input: root = [3,9,20,null,null,15,7]
*Output: 3
*Input: root = [0]
* Output: 1
*
* */


public class MaximumDepthofBinaryTree {

    //  Definition for a binary tree node.
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
        public int maxDepth(TreeNode root) {
            int level = 0;
            Queue<TreeNode> q = new LinkedList<>();
            if(root == null) return 0;
            q.add(root);
            while(q.size() > 0){
                int n = q.size();
                for(int i = 0; i < n; i++){
                    TreeNode t = q.poll();
                    if(t.left != null){
                        q.add(t.left);
                    }
                    if(t.right != null){
                        q.add(t.right);
                    }
                }
                level++;
            }
            return level;
        }
    }
}
