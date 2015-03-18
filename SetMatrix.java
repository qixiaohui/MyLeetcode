package com.leetcode.xiaohui;

public class SetMatrix {
	
//	leetcode url: https://oj.leetcode.com/problems/set-matrix-zeroes/
//	Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetMatrix setMatrix = new SetMatrix();
		System.out.println(setMatrix.solution(new int [][] {{0,1}}));
	}
	
	public int [] [] solution(int [] [] matrix){
		int height = matrix.length;
		int width = matrix[0].length;
		int [][] tmpMatrix = new int [height] [width];
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				tmpMatrix[i][j] = matrix[i][j];
			}
		}
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				if(matrix[i][j]==0 && tmpMatrix[i][j]== 0){
					for(int wj=0; wj<width; wj++){
						matrix[i][wj] = 0;
					}
					for(int hi=0; hi<height; hi++){
						matrix[hi][j] = 0;
					}
				}
			}
		}
		return matrix;
	}

}
