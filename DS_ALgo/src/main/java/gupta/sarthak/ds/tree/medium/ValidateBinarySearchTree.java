package gupta.sarthak.ds.tree.medium;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {

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
        public boolean isValidBST(TreeNode root) {
            List<Integer> a = new ArrayList<>();
            inOrderTraversal(root,a);
            for(int i = 0; i < a.size() - 1; i++){
                if(a.get(i) >= a.get(i+1))
                    return false;
            }
            return true;
        }
        public void inOrderTraversal(TreeNode root, List<Integer>a){
            if(root == null) return;
            inOrderTraversal(root.left,a);
            a.add(root.val);
            inOrderTraversal(root.right, a);
        }
    }
}
