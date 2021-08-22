package gupta.sarthak.ds.tree.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
*Given the root of a binary tree, return the sum of values of its deepest leaves.
*Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
* Output: 15
*
* The number of nodes in the tree is in the range [1, 10^4].
* 1 <= Node.val <= 100
* */

public class DeepestLeavesSum {
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
        public int deepestLeavesSum(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            List<List<Integer>> res = new ArrayList<>();
            if(root != null) q.add(root);
            int sum = 0;
            boolean isLevel;
            while(q.size() != 0){
                List<Integer>a = new ArrayList<>();
                int n = q.size();
                isLevel = true;
                for(int i = 0; i < n; i++){
                    TreeNode temp = q.poll();
                    a.add(temp.val);
                    if(temp.left != null){
                        q.add(temp.left);
                        isLevel = false;
                    }
                    if(temp.right != null){
                        q.add(temp.right);
                        isLevel = false;
                    }
                    sum = sum + temp.val;
                }
                if(isLevel == false){
                    sum = 0;
                }
            }
            return sum;
        }

    }
}
