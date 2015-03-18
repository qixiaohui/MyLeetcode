# leetcode: https://leetcode.com/problems/multiply-strings/
#Given two numbers represented as strings, return multiplication of the numbers as a string.
#
#Note: The numbers can be arbitrarily large and are non-negative.
class Solution:
    # @param num1, a string
    # @param num2, a string
    # @return a string
    def multiply(self, num1, num2):
        if "." in num1:
            intNum1=float (num1)
        else:
            intNum1=int (num1)
        if "." in num2:
            intNum2=float (num2)
        else:
            intNum2=int (num2)
        result=str(intNum1*intNum2)
        return result