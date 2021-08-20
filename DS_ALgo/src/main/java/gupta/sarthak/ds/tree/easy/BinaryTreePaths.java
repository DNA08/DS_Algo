package gupta.sarthak.ds.tree.easy;

import java.util.ArrayList;
import java.util.List;

/*
* Given the root of a binary tree, return all root-to-leaf paths in any order.
* Input: root = [1,2,3,null,5]
* Output: ["1->2->5","1->3"]
* The number of nodes in the tree is in the range [1, 100].
* -100 <= Node.val <= 100
*
* */
public class BinaryTreePaths {
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
        public static List<String> a = new ArrayList<>();
        public List<String> binaryTreePaths(TreeNode root) {
            a = new ArrayList<>();
            getPaths(root,"");
            return a;
        }
        public static void getPaths(TreeNode root, String ans){
            if(root == null) return;
            if(root.left == null && root.right == null){
                ans = ans +"->" + root.val;
                ans = ans.substring(2);
                a.add(ans);
                return;
            }
            ans = ans + "->"+ root.val ;
            getPaths(root.left,ans);
            getPaths(root.right,ans);
        }
    }
}
