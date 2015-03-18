package com.leetcode.xiaohui;

import java.util.ArrayList;
import java.util.Collections;

public class AddBinary {
	
//	leetcode url: https://oj.leetcode.com/problems/add-binary/
//	Given two binary strings, return their sum (also a binary string).
//
//			For example,
//			a = "11"
//			b = "1"
//			Return "100".

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddBinary addBinary = new AddBinary();
		System.out.println(addBinary.solution("10", "11"));
	}
	
	public String solution(String a, String b){
		ArrayList<Integer> lista = new ArrayList<Integer> ();
		ArrayList<Integer> listb = new ArrayList<Integer> ();
		ArrayList<Integer> result = new ArrayList<Integer> ();
		for(int i=0; i<a.length(); i++){
			lista.add(0,Integer.valueOf(a.charAt(i)-48));
		}
		for(int i=0; i<b.length(); i++){
			listb.add(0,Integer.valueOf(b.charAt(i)-48));
		}
		for(int i=0; i<Math.max(a.length(), b.length());i++){
			if(lista.size()!=i || listb.size()!=i){
				if(result.size()==i){
					result.add(i, 0);
				}
				if(lista.size()==i){
					lista.add(i, 0);
				}
				if(listb.size()==i){
					listb.add(i, 0);
				}
				int origin = result.get(i);
				result.set(i, lista.get(i)+listb.get(i)+origin);
				if(result.get(i)==2){
					result.set(i, 0);
					result.add(i+1,1);
				}else if(result.get(i)==3){
					result.set(i, 1);
					result.add(i+1,1);
				}
			}
		}
		Collections.reverse(result);
		StringBuffer strRes = new StringBuffer();
		for(int i=0; i<result.size(); i++){
			strRes.append(result.get(i));
		}
		return strRes.toString();
	}

}
