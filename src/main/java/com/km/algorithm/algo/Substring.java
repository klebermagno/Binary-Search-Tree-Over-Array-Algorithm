package com.km.algorithm.algo;

import java.lang.reflect.*;
import java.lang.*;

class Substring {
	
	public static void main(String args[]) {
		// System.out.println("code wrks fr string with number of one's more
		// than number of zero's");
		String s = args[0];
		char[] str = s.toCharArray();
		// System.out.println(Array.getLength(str));
		// int len=str.length();
		int i, c = 0, so = 0, sz = 0, ls, zf, zl, alfa = 0, ss, se, ss1, se1;
		// while(str[i]!=null){i++;}
		int len = Array.getLength(str);
		int z = 0, o = 0, omz = 0;
		for (i = 0; i < len; i++) {
			if (str[i] == '0') {
				z++;
			} else {
				o++;
			}
		}
		i = 0;
		while (str[i] != '0') {
			i++;
		}
		zf = i;
		ss = i;
		i = len - 1;
		while (str[i] != '0') {
			i--;
		}
		zl = i;
		se = i;
		ls = zl - zf + 1;
		if (o > z) {
			omz = o - z;
			// System.out.println("no is 1's "+zf);
			// System.out.println("no is 0's "+zl);
			// System.out.println("no is 1's minus no. of 0's "+omz);
			for (i = zf; i <= zl; i++) {
				if (str[i] == '1')
					so++;
			}
			sz = ls - so;
			// System.out.println("no of ones inside extreme zero's"+so);
			if (so <= sz) {
				alfa = sz - so;
				if (((len - 1) - se) >= alfa) {
					se = se + alfa;
				} else {
					se = len - 1;
					ss = ss - (alfa - ((len) - se));
				}
				for (i = ss; i <= se; i++)
					System.out.print(str[i]);
			} else {
				// System.out.print(so+" ");
				// System.out.println(sz);
				int i1;
				i = len - 1;
				alfa = o - z;
				// System.out.print(o+"is 1's");
				// System.out.println(z+"is 0's");
				// System.out.print(alfa+" is alfa ");//System.out.println(sz);
				while ((alfa != 0)) {
					if (str[i] == '1') {
						alfa--;
						i--;
					} else {
						alfa++;
						i--;
					}
				}
				if (i == -1) {
					System.out.println("full string exhausted");
				} else {
					se = i;
				}
				for (i1 = ss; i1 <= se; i1++)
					System.out.print(str[i1]);
			}
		} else
			return;

	}
}
