package com.leetcode.xiaohui;

import javax.swing.tree.TreeNode;

public class SameTree {
	
//	leetcode: https://leetcode.com/problems/same-tree/
//	Given two binary trees, write a function to check if they are equal or not.
//
//	Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }else if(p!=null && q!=null){
            if(p.val!=q.val){
                return false;
            }else{
                return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
            }
        }else{
            return false;
        }
    }

}
