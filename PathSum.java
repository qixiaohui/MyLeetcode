package com.leetcode.xiaohui;

import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class PathSum {
	
//	Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
//
//	For example:
//	Given the below binary tree and sum = 22,
//	              5
//	             / \
//	            4   8
//	           /   / \
//	          11  13  4
//	         /  \      \
//	        7    2      1
//	return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    ArrayList<Integer> stack=new ArrayList<Integer> ();
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
       return getStack(root,0,sum);
    }
    public boolean getStack(TreeNode node,int currSum,int sum){
        currSum=currSum+node.val;
        if(node.left==null && node.right==null){
            if(currSum==sum){
                return true;
            }else{
                return false;
            }
        }else{
            if(node.left==null){
                return getStack(node.right,currSum,sum);
            }else if(node.right==null){
                return getStack(node.left,currSum,sum);
            }else{
                return getStack(node.left,currSum,sum)||getStack(node.right,currSum,sum);
            }
        }
    }

}
