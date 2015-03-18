package com.leetcode.xiaohui;

public class SearchMatrix {
	
//	leetcode url: https://oj.leetcode.com/problems/search-a-2d-matrix/
//	Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
//
//		Integers in each row are sorted from left to right.
//		The first integer of each row is greater than the last integer of the previous row.
//		For example,
//
//		Consider the following matrix:
//
//		[
//		  [1,   3,  5,  7],
//		  [10, 11, 16, 20],
//		  [23, 30, 34, 50]
//		]
//		Given target = 3, return true.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchMatrix searchMatrix = new SearchMatrix();
//		System.out.println(searchMatrix.solution(new int [] [] {{1,3,5,7},{10,11,16,20},{23,30,34,50}}, 7));
		System.out.println(searchMatrix.solution(new int [] [] {{1},{3},{5}}, 4));
	}

	public boolean solution(int[][] matrix, int target){
		int width = matrix[0].length;
		int height = matrix.length;
		int rowCount = 0;
		for(int i=0; i<height; i++){
			if(matrix[i][0]>target){
				rowCount = i-1;
				break;
			}else if(matrix[i][0] == target){
				return true; 
			}
			if(i==height-1){
				rowCount=height-1;
			}
		}
		if(rowCount<0){
			return false;
		}
		int left = 0;
		int right = width-1;
		int middle = 0;
		for(int i=0; i<width; i++){
			if((left+right)%2==1){
				middle = (int)(left+right)/2+1;
			}else{
				middle = (int)(left+right)/2;
			}
//			System.out.println(left+"::"+middle+"::"+right);
			if(middle>right){
				if(matrix[rowCount][left]!=target){
					return false;
				}else{
					return true;
				}
			}
//			System.out.println(matrix[rowCount][middle]);
			if(target == matrix[rowCount][left] 
					|| target == matrix[rowCount][right]){
				return true;
			}else if(target<matrix[rowCount][middle]){
				right = middle;
			}else if(target>matrix[rowCount][middle]){
				left = middle;
			}else if(target==matrix[rowCount][middle]){
				return true;
			}
		}
		return false;
	}
}
