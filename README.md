## Calculadora Avançada em Java

> Desenvolver uma aplicação Java que simule uma calculadora com funcionalidades matemáticas avançadas. Os alunos devem implementar uma classe Calculadora com as funções descritas abaixo e criar um menu de interação com o usuário via console. Na função principal deverá ser criada uma instância dessa classe. Uma pergunta será direcionada ao usuário para que ele indique qual das funções deseja executar. A depender da resposta do usuário, deverão ser lidos os parâmetros relativos a função solicitada e impresso em tela o valor retornado pela função.

## Funcionamento dos métodos básicos

O funcionamento dos métodos mais básicas são simples:

- Solicitação de valores
  O metodo solicita os valores para realização do calculo solicitado.
- Execução e retorno do calculo
  O programa realiza o calculo(multiplicação, divisão, soma e subtração) e depois retorna o produto.

## Funcionamento dos métodos mais avançados

Os métodos mais avançados funcionam da seguinte maneira:

### Fatorial

Primeiramente, o metodo verifica se o valor inserido é negativo, se for, uma mensagem de erro é emitida

```java
int fat(int x) {
		if (x < 0) {
			System.out.println("ERROR! Valor não pode ser negativo."); // Se o número for menor que 0, exibir erro
			return -1;
		}

		int f = 1; // f começa como 1
		for (int i = 1; i <= x; i++) { //variavel de iteração "i" começa com 1, enquanto i for menor que o numero inserido pelo usuario, i é incrementado a cada iteração do laço FOR
			f *= i;
            /*
            * Exemplo: x = 5;
            *   f = f * i
            *   f = 1 * 1  || F agora é o resultado de 1 * 1
            *   f = 1 * 2  || F agora é o resultado de 1 * 2
            *   f = 2 * 3  || F agora é o resultado de 2 * 3
            *   f = 6 * 4  || F agora é o resultado de 6 * 4
            *   f = 24 * 5 || F agora é o resultado de 24 * 5
            * a variavel de iteração "i" já é igual a "x" aqui, portanto, o laço acaba aqui.
            */
		}
		return f;
	}
```

### Exponencial

```java
double exp(double base, double expoente) {
		double result = 1; //i começa como 1

		for (int i = 1; i < expoente; i++) { // variavel de iteração começa com 1, enquanto i for menor que o expoente, i irá acrescentar 1
			result = base * base;
            /*exemplo: base = 8 e expoente 2
            *enquanto i for menor que 2, irá acrescentar em i
            *1 = 8 * 8 = 64
            *1 = 64
            */
             return result;
		}
		return result;
	}
```