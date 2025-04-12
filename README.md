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
int f = x; 
	if (x <= 0) {
		System.out.println("ERROR! Valor não pode ser menor ou igual a 0.");
	}
	while (x > 1) {
		f = f * (x - 1);
	}
return f;
```
Enquanto o valor inserido pelo usuario for maior que 1, o programa irá multiplicar o valor inserido pelo usuário pelo mesmo valor menos 1, ou seja, se o número inserido for 6, será: 6 = 6 * 5, 6 * 4, 6 * 3 .....

### Exponencial

