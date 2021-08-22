package gupta.sarthak.ds.tree.medium;

import java.util.ArrayList;
import java.util.List;

/*
* Given the root of a binary search tree, and an integer k, return the kth (1-indexed) smallest element in the tree.
* Input: root = [3,1,4,null,2], k = 1
* Output: 1
*
* The number of nodes in the tree is n.
* 1 <= k <= n <= 104
* 0 <= Node.val <= 104
* Follow up: If the BST is modified often (i.e., we can do insert and delete operations) and you need to find the kth smallest frequently, how would you optimize?
 * */

public class KthSmallestElementInABST {

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
        public int kthSmallest(TreeNode root, int k) {
            List<Integer> a = new ArrayList<>();
            inOrderTraversal(root,a);
            return a.get(k-1);
        }
        public void inOrderTraversal(TreeNode root, List<Integer>a){
            if(root == null) return;
            inOrderTraversal(root.left,a);
            a.add(root.val);
            inOrderTraversal(root.right, a);
        }
    }
}
