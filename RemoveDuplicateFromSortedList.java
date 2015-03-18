package com.leetcode.xiaohui;

import com.leetcode.xiaohui.MergeList.ListNode;

public class RemoveDuplicateFromSortedList {
	
	
// 	leetcode: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
//	Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//	For example,
//	Given 1->1->2, return 1->2.
//	Given 1->1->2->3->3, return 1->2->3.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode deleteDuplicates(ListNode head) {
        int tmp=0;
        ListNode result=null;
        
        if(head==null || head.next==null){
            return head;
        }else{
            result=head;
            tmp=result.next.val;
        }
        while(result.next!=null){
            if(result.val==tmp){
                result.next=result.next.next;
                if(result.next==null){
                    break;
                }else{
                    tmp=result.next.val;
                }
            }else{
                result=result.next;
                if(result.next!=null){
                    tmp=result.next.val;
                }
            }
        }
        return head;
    }

}
