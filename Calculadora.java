package CalculadoraAvançada;

public class Calculadora {
	double soma(double a, double b) {
		return a + b;
	}

	double sub(double a, double b) {
		return a - b;
	}

	double mult(double a, double b) {
		return a * b;
	}

	double div(double numerador, double denominador) {
		if (denominador <= 0) {
			System.out.println("ERROR! Denominador não pode ser menor ou igual a 0.");
		}
		return numerador / denominador;

	}

	int fat(int x) {
		if (x < 0) {
			System.out.println("ERROR! Valor não pode ser negativo.");
			return -1;
		}

		int f = 1;
		for (int i = 1; i <= x; i++) {
			f *= i;
		}
		return f;
	}

	double exp(double base, double expoente) {
		double result = 1;

		for (int i = 1; i < expoente; i++) {
			result = base * base;
		}
		return result;
	}

	double raizQuadrada(double x) {
		if (x < 0) {
			System.out.println("Error! Numero não pode ser menor ou igual a zero!");
			return -1;
		}

		double chute = x / 2;
		double precisao = 0.00001;

		while ((chute * chute - x) > precisao || (x - chute * chute) > precisao) {
			chute = (chute + x / chute) / 2;
		}

		return chute;
	}

	void fibo(int x) {
		int n1 = 0, n2 = 1;
		for (int qtd = x; qtd > 0; qtd--) {
			System.out.print(n1 + " ");
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		System.out.println("\n\n");

	}

}
