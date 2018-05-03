package br.edu.iftm;

public class fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;

		System.out.println("Fatorial (função iterativa) de " + n + " = " + fatorialInt(n));
		System.out.println("Fatorial (função recursiva) de " + n + " = " + fatorialRec(n));

	}

	static int fatorialRec(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return fatorialRec(n - 1) * n;
		}

	}

	static int fatorialInt(int n) {
		int resultado = n;
		for (int i = 1; i < n; i++) {
			resultado = resultado * (n - i);

		}

		return resultado;
	}
}
