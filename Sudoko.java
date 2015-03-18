package com.leetcode.xiaohui;

import java.util.HashSet;
import java.util.Set;

public class Sudoko {
	
//  leetcode url: https://oj.leetcode.com/problems/valid-sudoku/
//	Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
//
//	The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
//
//
//	A partially filled sudoku which is valid.
//
//	Note:
//	A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sudoko sudoko = new Sudoko();
		char [] [] cube = new char [] [] {
				{'.','8','7','6','5','4','3','2','1'},
				{'2','.','.','.','.','.','.','.','.'},
				{'3','.','.','.','.','.','.','.','.'},
				{'4','.','.','.','.','.','.','.','.'},
				{'5','.','.','.','.','.','.','.','.'},
				{'6','.','.','.','.','.','.','.','.'},
				{'7','.','.','.','.','.','.','.','.'},
				{'8','.','.','.','.','.','.','.','.'},
				{'9','.','.','.','.','.','.','.','.'},
		};
		System.out.println(sudoko.solution(cube));
	}

	public boolean solution(char[][] board){
		//seach vertical
		for(int i=0; i<board.length; i++){
			Set column = new HashSet();
			for(int j=0; j<board.length; j++){
				if(board[i][j] != '.'){
					if(column.contains(board[i][j])){
						return false;
					}else{
						column.add(board[i][j]);
					}
				}
			}
		}
		//search horizontal
		for(int i=0;i<board.length; i++){
			Set row = new HashSet();
			for(int j=0;j<board.length; j++){
				if(board[j][i] != '.'){
					if(row.contains(board[j][i])){
						return false;
					}else{
						row.add(board[j][i]);
					}
				}
			}
		}
		//check subbox
		for(int i=0; i<board.length/3; i++){
			for(int j=0; j<board.length/3; j++){
				Set sub = new HashSet();
				for(int subi=3*i; subi<3+3*i; subi++){
					for(int subj=3*j; subj<3+3*j;subj++){
						if(board[subi][subj]!='.'){
							if(sub.contains(board[subi][subj])){
								return false;
							}else{
								sub.add(board[subi][subj]);
							}
						}
					}
				}
			}
		}
		
		return true;
	}
}
