package CalculadoraAvançada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("[1] soma\n[2] subtração\n[3] multiplicação\n[4] divisão\n[5] fatorial\n[6] exponencial\n[7] raiz quadrada\n[8] fibonacci \n\nEscolha uma opção");
			int escolha = input.nextInt();
			input.nextLine();

			switch (escolha) {
			case 1:
				double a = input.nextDouble();
				double b = input.nextDouble();

				c.soma(a, b);
				break;
			case 2:
				double sub1 = input.nextDouble();
				double sub2 = input.nextDouble();

				c.sub(sub1, sub2);
				break;

			case 3:
				double m1 = input.nextDouble();
				double m2 = input.nextDouble();

				c.mult(m1, m2);
				break;

			case 4:
				double d1 = input.nextDouble();
				double d2 = input.nextDouble();

				c.div(d1, d2);
				break;

			case 5:
				int f1 = input.nextInt();
				c.fat(f1);
				break;

			case 6:
				double b1 = input.nextDouble();
				double b2 = input.nextDouble();

				c.exp(b1, b2);
				break;

			case 7:
				System.out.println("Digite um número para calcular a raiz quadrada:");
				double x = input.nextDouble();
				System.out.println("Raiz quadrada de " + x + " é: " + c.raizQuadrada(x));
				break;
			default:
				System.out.println("Opção invalida.");

			}
		}
	}

}
