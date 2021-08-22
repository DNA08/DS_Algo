package gupta.sarthak.ds.tree.medium;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
* Given the root of a binary tree, return the bottom-up level order traversal of its nodes' values. (i.e., from left to right, level by level from leaf to root).
*Input: root = [3,9,20,null,null,15,7]
* Output: [[15,7],[9,20],[3]]
*
*
* */

public class BinaryTreeLevelOrderTraversalII {
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
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            List<List<Integer>> res = new ArrayList<>();
            if(root == null) return res;
            q.add(root);
            while(q.size() != 0){
                List<Integer>a = new ArrayList<>();
                int n = q.size();
                for(int i = 0; i < n; i++){
                    TreeNode t = q.poll();
                    a.add(t.val);
                    if(t.left != null){
                        q.add(t.left);
                    }
                    if(t.right != null){
                        q.add(t.right);
                    }
                }
                res.add(0 , a);
            }
            return res;
        }
    }
}
