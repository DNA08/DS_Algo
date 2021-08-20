package gupta.sarthak.ds.tree.easy;
import java.util.ArrayList;
import java.util.List;


/*
*Given the root of a binary tree, return the preorder traversal of its nodes' values.
 *Input: root = [1,null,2,3]
* Output: [1,2,3]
*
* The number of nodes in the tree is in the range [0, 100].
* -100 <= Node.val <= 100
* */

public class BinaryTreePreorderTraversal {
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
    static class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer>ans = new ArrayList<>();
            return doPreOrder(root,ans);
        }

        public static List<Integer> doPreOrder(TreeNode root, List<Integer> ans){
            if(root == null) return ans;
            ans.add(root.val);
            doPreOrder(root.left, ans);
            doPreOrder(root.right, ans);
            return ans;
        }
    }

}
