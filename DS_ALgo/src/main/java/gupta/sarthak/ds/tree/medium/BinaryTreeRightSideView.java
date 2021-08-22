package gupta.sarthak.ds.tree.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
* Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
* Input: root = [1,2,3,null,5,null,4]
* Output: [1,3,4]
* The number of nodes in the tree is in the range [0, 100].
* -100 <= Node.val <= 100
* */

public class BinaryTreeRightSideView {

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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            if(root == null) return ans;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while(q.size() > 0){
                int n = q.size();
                for(int i = 0; i < n; i++){
                    TreeNode t = q.poll();
                    if(i == n -1){
                        ans.add(t.val);
                    }
                    if(t.left != null){
                        q.add(t.left);
                    }
                    if(t.right != null){
                        q.add(t.right);
                    }
                }
            }
            return ans;
        }
    }
}
