# leetcode: https://leetcode.com/problems/count-and-say/
#The count-and-say sequence is the sequence of integers beginning as follows:
#1, 11, 21, 1211, 111221, ...
#
#1 is read off as "one 1" or 11.
#11 is read off as "two 1s" or 21.
#21 is read off as "one 2, then one 1" or 1211.
#Given an integer n, generate the nth sequence.
#
#Note: The sequence of integers will be represented as a string.
class Solution:
    # @return a string
    def countAndSay(self, n):
        seq="1"
        for j in range(0,n-1):
            res=""
            tmp=seq[0]
            sum=0
            for i in range(0,len(seq)):
                if tmp==seq[i]:
                    sum+=1
                else:
                    res+=str(sum)+tmp
                    tmp=seq[i]
                    sum=1
            res+=str(sum)+tmp
            seq=res
        return seq