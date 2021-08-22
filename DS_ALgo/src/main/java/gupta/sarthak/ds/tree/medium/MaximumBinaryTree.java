package gupta.sarthak.ds.tree.medium;

import java.util.Arrays;

/*
* You are given an integer array nums with no duplicates. A maximum binary tree can be built recursively from nums using the following algorithm:
* 1. Create a root node whose value is the maximum value in nums.
* 2. Recursively build the left subtree on the subarray prefix to the left of the maximum value.
* 3. Recursively build the right subtree on the subarray suffix to the right of the maximum value.
* Return the maximum binary tree built from nums.
* Input: nums = [3,2,1,6,0,5]
*Output: [6,3,5,null,2,0,null,null,1]
* 1 <= nums.length <= 1000
*0 <= nums[i] <= 1000
*All integers in nums are unique.
* */

public class MaximumBinaryTree {
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
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            if(nums.length == 0) return null;
            int[] i = findMaximum(nums);
            int max = i[0];
            int index = i[1];
            TreeNode node = new TreeNode(max);
            if(0 <= index -1){
                node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums,0,index));
            }else{
                node.left = null;
            }
            if(index+1 <= nums.length){
                node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums,index + 1,nums.length));
            }else{
                node.right = null;
            }
            return node;
        }
        public int[] findMaximum(int[] a){
            int max = Integer.MIN_VALUE;
            int index = 0;
            for(int i = 0; i < a.length; i++){
                if(a[i] > max){
                    max = a[i];
                    index = i;
                }
            }
            return new int[]{max,index};
        }
    }
}
