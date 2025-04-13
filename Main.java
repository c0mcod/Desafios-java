package CalculadoraAvançada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println(
					"[1] soma\n[2] subtração\n[3] multiplicação\n[4] divisão\n[5] fatorial\n[6] exponencial\n[7] raiz quadrada\n[8] fibonacci\n[9] Sair\n\nEscolha uma opção");
			int escolha = input.nextInt();
			input.nextLine();

			switch (escolha) {
			case 1:
				System.out.println("Digite os valores a serem somados: ");
				double a = input.nextDouble();
				double b = input.nextDouble();

				System.out.println("O resultado da soma entre" + a + " e " + b + " é: " + c.soma(a, b));
				break;
			case 2:
				System.out.println("Digite os valores a serem subtraidos: ");
				double sub1 = input.nextDouble();
				double sub2 = input.nextDouble();
				System.out
						.println("O resultado da subtração entre " + sub1 + " e " + sub2 + " é: " + c.sub(sub1, sub2));
				break;

			case 3:
				System.out.println("Digite os valores a serem multiplicados: ");
				double m1 = input.nextDouble();
				double m2 = input.nextDouble();
				System.out.println("O resultado entre " + m1 + " e " + m2 + " é " + c.mult(m1, m2));
				break;
			case 4:
				double d1 = input.nextDouble();
				double d2 = input.nextDouble();
				System.out.println("O resultado da divisão entre " + d1 + " e " + d2 + " é " + c.div(d1, d2));
				break;

			case 5:
				System.out.println("Digite o valor: ");
				int f1 = input.nextInt();
				System.out.println("O fatorial de " + f1 + " é: " + c.fat(f1));
				break;

			case 6:
				double b1 = input.nextDouble();
				double b2 = input.nextDouble();
				System.out.println(
						"O resultado da exponenciação de base " + b1 + " e expoente " + b2 + " é: " + c.exp(b1, b2));
				break;

			case 7:
				System.out.println("Digite um número para calcular a raiz quadrada:");
				double x = input.nextDouble();
				System.out.println("Raiz quadrada de " + x + " é: " + c.raizQuadrada(x));
				break;
			case 8:
				System.out.println("Digite a quantidade de termos");
				int f = input.nextInt();
				c.fibo(f);
				break;
			case 9:
				System.out.println("Saindo...");
				input.close();
				return;
			default:
				System.out.println("Opção invalida.");

			}
		}
	}

}
