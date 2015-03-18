package com.leetcode.xiaohui;

public class MergeList {

// leetcode url: https://oj.leetcode.com/problems/merge-two-sorted-lists/
//	Merge two sorted linked lists and return it as a new list. The new list should be 
//	made by splicing together the nodes of the first two lists.
	
  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeList mergeList = new MergeList();
	}
	
	public ListNode solution(ListNode l1, ListNode l2){
		ListNode result =null;
		if(l1 == null && l2 == null){
		    return null;
		}
		if(l1 == null){
		    return l2;
		}else if(l2 == null){
		    return l1;
		}
		if(l1.val<=l2.val){
			result = l1;
		}else{
			result = l2;
		}
		while(l1!=null && l2!=null){
			ListNode tmp = null;
			if(l1.val<=l2.val && (l1.next ==null || l1.next.val>l2.val)){
				tmp = l1.next;
				l1.next = l2;
				l1 = tmp;
			}else if(l1.val>l2.val && (l2.next == null || l2.next.val>=l1.val)){
			    tmp = l2.next;
				l2.next = l1;
				l2 = tmp;
			}else{
			    if(l1.val<=l2.val){
			        l1 = l1.next;
			    }else{
			        l2 = l2.next;
			    }
			}
		}
		return result;
	}

}
