#   leetcode: https://leetcode.com/submissions/detail/17743917/
#Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
#
#If the last word does not exist, return 0.
#
#Note: A word is defined as a character sequence consists of non-space characters only.
#
#For example, 
#Given s = "Hello World",
#return 5
class Solution:
    # @param s, a string
    # @return an integer
    def lengthOfLastWord(self, s):
        list=s.split()
        if len(list)==0:
            return 0
        if(list[len(list)-1].isalpha()):
            return len(list[len(list)-1])
        else:
            return 0