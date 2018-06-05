package com.km.algorithm.algo;

public class Palindromic {

	public static void main(String[] args) {
		String word = "a12321";

		
			System.out.println("The word " + longestPalindrom(word) + " is a palindrom.");
	}

	private static String longestPalindrom(String word) {
		String longest = word.substring(0, 1);
		
		for (int i = 0; i < word.length(); i++) {
			String ret = inter(word,i,i);
			System.out.println(ret);
			if(ret.length() > longest.length())
				longest = ret;
			
		}

		return longest;

	}

	private static String inter(String word, int l, int r) {
		while(
				l>=0 && r <= word.length() -1
				&&
				(word.charAt(l)==word.charAt(r)) 
				){
			l--;
			r++;
		}
			System.out.println(l+  " "+ r);
		return word.substring(l+1, r);
	}
}
