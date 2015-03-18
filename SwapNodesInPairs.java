package com.leetcode.xiaohui;

import com.leetcode.xiaohui.MergeList.ListNode;

public class SwapNodesInPairs {
	
//	leetcode: https://leetcode.com/problems/swap-nodes-in-pairs/
//	Given a linked list, swap every two adjacent nodes and return its head.
//
//	For example,
//	Given 1->2->3->4, you should return the list as 2->1->4->3.
//
//	Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	
    public ListNode swapPairs(ListNode head) {
        ListNode swap=head;
        while(swap!=null){
            if(swap.next!=null){
                int tmp=swap.next.val;
                swap.next.val=swap.val;
                swap.val=tmp;
                swap=swap.next.next;
            }else{
                break;
            }
        }
        return head;
    }

}
