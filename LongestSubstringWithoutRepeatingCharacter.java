package com.leetcode.xiaohui;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacter {
	
//	leetcode: https://leetcode.com/problems/longest-substring-without-repeating-characters/
//	Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> charList = new ArrayList<Character>();
        int tmp=0;
        for(int i=0;i<s.length();i++){
            
            if(!contain(charList,s.charAt(i))){
                charList.add(s.charAt(i));
            }else{
                if(charList.size()>tmp){
                    tmp=charList.size();
                }
                int index=charList.indexOf(s.charAt(i));
                for(int j=0;j<=index;j++){
                    
                    charList.remove(0);
                    
                }
                charList.add(s.charAt(i));

            }
            
        }
        return charList.size()>tmp?charList.size():tmp;
    }
    
    public boolean contain(ArrayList<Character> charList,Character c){
        boolean flag=false; 
        for(int i=0;i<charList.size();i++){
            if(charList.get(i).equals(c)){
                return true;
            }
        }
        return false;
    }
}
