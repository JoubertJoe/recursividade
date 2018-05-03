package br.edu.iftm;

public class Fibonnaci {

	public static void main(String[] args) {
		int n = 7;

		System.out.println("fib " + n + " = " + fibonnaciIt(n));
		System.out.println("fib " + n + " = " + fibonnaciRec(n));
	}

	public static int fibonnaciIt(int n) {

		int fib = 0;
		int fib1 = 1;
		int fib2 = 1;

		if (n < 1) {
			return n;
		} else {
			for (int i = 0; i < n; i++) {
				fib = fib1;
				fib1 = fib2;
				fib2 = fib1 + fib;
			}
			return fib;
		}

	}

	public static int fibonnaciRec(int n) {
		if (n == 0) {
			return 0;
		} else {
			if (n == 1) {
				return 1;
			} else {
				return fibonnaciRec(n - 1) + fibonnaciRec(n - 2);
			}

		}

	}
}
