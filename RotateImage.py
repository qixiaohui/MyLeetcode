# leetcode: https://leetcode.com/problems/rotate-image/
#You are given an n x n 2D matrix representing an image.
#
#Rotate the image by 90 degrees (clockwise).
#
#Follow up:
#Could you do this in-place?
class Solution:
    # @param matrix, a list of lists of integers
    # @return a list of lists of integers
    def rotate(self, matrix):
        size=len(matrix[0])
        tmp=0
        for i in range(0,size):
            for j in range(0,size-i):
                tmp=matrix[i][j]
                matrix[i][j]= matrix[size-1-j][size-1-i]
                matrix[size-1-j][size-1-i]=tmp
        for i in range(0,size/2):
            for j in range(0,size):
                tmp=matrix[i][j]
                matrix[i][j]=matrix[size-1-i][j]
                matrix[size-1-i][j]=tmp
        return matrix