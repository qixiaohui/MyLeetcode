package com.leetcode.xiaohui;

import com.leetcode.xiaohui.MergeList.ListNode;

public class AddTwoNumber {
	
//	leetcode: https://leetcode.com/problems/add-two-numbers/
//	You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//			Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//			Output: 7 -> 0 -> 8

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int shift = 0;
        ListNode current=new ListNode(0);
        ListNode l3 = current;
        while(l1!=null || l2!=null || shift!=0){
            int l1Val = 0;
            int l2Val = 0;
            if(l1 == null){
                l1Val = 0;
            }else{
                l1Val = l1.val;
                l1 = l1.next;
            }
            
            if(l2 == null){
                l2Val = 0;
            }else{
                l2Val = l2.val;
                l2 = l2.next;
            }
            ListNode head = new ListNode((l1Val+l2Val+shift)%10);
            shift = (int)(l1Val+l2Val+shift)/10;
            l3.next = head;
            l3 = head;
        }
        return current.next;
    }

}
