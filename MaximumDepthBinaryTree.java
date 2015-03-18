package com.leetcode.xiaohui;

import javax.swing.tree.TreeNode;

public class MaximumDepthBinaryTree {
	
// leetcode: https://leetcode.com/problems/maximum-depth-of-binary-tree/	
//	Given a binary tree, find its maximum depth.
//
//	The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int maxleft = maxDepth(root.left);
        int maxright = maxDepth(root.right);
        return maxleft>maxright?maxleft+1:maxright+1;
    }
}
