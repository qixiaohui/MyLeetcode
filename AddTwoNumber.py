# leetcode: https://leetcode.com/submissions/detail/17138297/
#You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
#
#Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
#Output: 7 -> 0 -> 8
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @return a ListNode
    def addTwoNumbers(self, l1, l2):
        shift = 0
        current = ListNode(0)
        l3 = current
        while l1!=None or l2!=None or shift!=0:
            if l1 == None:
                l1Val = 0
            else:
                l1Val = l1.val
                l1 = l1.next
            if l2 == None:
                l2Val = 0
            else:
                l2Val = l2.val
                l2 = l2.next
            head = ListNode((l1Val+l2Val+shift)%10)
            shift = (l1Val+l2Val+shift)//10
            l3.next = head
            l3 = head
        return current.next