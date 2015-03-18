#Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
#
#For example,
#"A man, a plan, a canal: Panama" is a palindrome.
#"race a car" is not a palindrome.
#
#Note:
#Have you consider that the string might be empty? This is a good question to ask during an interview.
#
#For the purpose of this problem, we define empty string as valid palindrome.
class Solution:
    # @param s, a string
    # @return a boolean
    def isPalindrome(self, s):
        s=re.sub('[^0-9a-zA-Z ]+','',s)
        s=s.replace(" ","")
        s=s.lower()
        stack=[]
        for i in range(0,len(s)/2):
            stack.append(s[i])
        if len(s)%2==0:
            for j in range(len(s)/2,len(s)):
                if stack.pop()!=s[j]:
                    return False
        elif len(s)%2==1:
            for j in range(len(s)/2+1,len(s)):
                if stack.pop()!=s[j]:
                    return False
        return True