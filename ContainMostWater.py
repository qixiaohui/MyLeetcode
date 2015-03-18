# leetcode: https://leetcode.com/problems/container-with-most-water/
#Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
#
#Note: You may not slant the container.
class Solution:
    # @return an integer
    def maxArea(self, height):
        i=0
        j=len(height)-1
        lh=height[0]
        rh=height[len(height)-1]
        tmp=0
        max=0
        while i<j:
            if(rh>lh):
                tmp = (j-i)*lh
            else:
                tmp=(j-i)*rh
            if tmp>max:
                max=tmp
            if height[i]<height[j]:
                while i<j and height[i]<=lh:
                    i+=1
                if i<j:
                    lh=height[i]
            else:
                while i<j and height[j]<=rh:
                    j-=1
                if i<j:
                    rh=height[j]
        return max