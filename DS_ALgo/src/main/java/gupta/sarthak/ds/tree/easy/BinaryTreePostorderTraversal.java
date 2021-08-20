package gupta.sarthak.ds.tree.easy;
import java.util.ArrayList;
import java.util.List;

/*
*Given the root of a binary tree, return the postorder traversal of its nodes' values.
*Input: root = [1,null,2,3]
*Output: [3,2,1]
*The number of the nodes in the tree is in the range [0, 100].
*-100 <= Node.val <= 100
*
* */


public class BinaryTreePostorderTraversal {

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
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            return doPostOrder(root,ans);
        }
        public static List<Integer> doPostOrder( TreeNode root, List<Integer>ans){
            if(root == null) return ans;
            doPostOrder(root.left,ans);
            doPostOrder(root.right,ans);
            ans.add(root.val);
            return ans;
        }
    }
}
