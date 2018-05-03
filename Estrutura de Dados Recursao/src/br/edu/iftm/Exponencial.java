package br.edu.iftm;

import java.text.BreakIterator;

public class Exponencial {

	public static void main(String[] args) {
		int n = 5;
		int e = 3;

		System.out.println("Exponencial de " + n + " ^ " + e + "  = " + expIt(n, e));
		System.out.println("Exponencial de " + n + " ^ " + e + "  = " + expRec(n, e));

	}

	public static int expIt(int n, int e) {
		if (e == 0 && n == 0) {
			System.out.println("ERRO 0 ^ 0 não é uma conta válida!");
			return -1;
		} else {
			if (e == 0 && n != 0) {
				return 1;
			} else {
				if (e == 1) {
					return n;
				} else {

					int exp = n;
					for (int i = 1; i < e; i++) {
						exp = exp * n;
					}
					return exp;
				}
			}
		}
	}

	public static int expRec(int n, int e) {

		if (e == 1) {
			return n;
		} else {
			if (e == 0 && n == 0) {
				System.out.println("ERRO 0 ^ 0 não é uma conta válida!");
				return -1;
			} else {
				if (e == 0 && n != 0) {
					return 1;
				} else {
					return n * expRec(n, e - 1);

				}
			}
		}
	}
}