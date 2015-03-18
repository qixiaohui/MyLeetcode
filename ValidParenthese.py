#leetcode: https://leetcode.com/problems/valid-parentheses/
#Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
#
#The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
class Solution:
    # @return a boolean
    def isValid(self, s):
        dict1 = {"}":"{",")":"(","]":"["}
        stack=[]
        for i in range(0,len(s)):
            c=s[i]
            r=dict1.get(c)
            if r==None:
                stack.append(c)
            else:
                if len(stack)==0:
                    return False
                if stack.pop()!=dict1.get(c):
                    return False
        if len(stack)!=0:
            return False
        return True