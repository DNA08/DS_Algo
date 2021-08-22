package gupta.sarthak.ds.tree.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
*
* Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
*Input: root = [3,9,20,null,null,15,7]
*Output: [[3],[9,20],[15,7]]
*The number of nodes in the tree is in the range [0, 2000].
*-1000 <= Node.val <= 1000
*
* */

public class BinaryTreeLevelOrderTraversal {
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            List< List<Integer>> res = new ArrayList<>();
            if(root != null) q.add(root);
            while(q.size() != 0){
                List<Integer>a = new ArrayList<>();
                int n = q.size();
                for(int i = 0; i < n; i++){
                    TreeNode temp = q.poll();
                    a.add(temp.val);
                    if(temp.left != null){
                        q.add(temp.left);
                    }
                    if(temp.right != null){
                        q.add(temp.right);
                    }
                }
                res.add(a);
            }
            return res;

        }
    }
}
