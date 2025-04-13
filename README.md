#  Calculadora Avançada em Java

Projeto de uma **calculadora matemática avançada** desenvolvida em Java, com foco em implementar lógicas matemáticas do zero — sem utilizar bibliotecas externas como `Math`. Ideal para fins didáticos e prática de programação orientada a objetos, estruturas de repetição, controle de fluxo e lógica de algoritmos.

##  Funcionalidades

O usuário pode escolher entre as seguintes operações via **menu no console**:

```
[1] Soma
[2] Subtração
[3] Multiplicação
[4] Divisão
[5] Fatorial
[6] Exponencial
[7] Raiz quadrada
[8] Fibonacci
```

---

##  Estrutura do Projeto

A calculadora é implementada com uma classe `Calculadora`, que contém os métodos responsáveis por realizar os cálculos. Na `Main`, é instanciada essa classe e um menu interativo coleta os dados do usuário e executa as operações desejadas.

---

##  Operações Básicas

As operações de soma, subtração, multiplicação e divisão recebem dois valores do usuário e retornam o resultado diretamente no console.

---

##  Funcionalidades Avançadas

###  Fatorial

Calcula o fatorial de um número inteiro positivo.

```java
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
```

 Exemplo (x = 5):
```
f = 1 * 1
f = 1 * 2
f = 2 * 3
f = 6 * 4
f = 24 * 5 → Resultado: 120
```

---

###  Exponencial

Calcula a potência de uma base elevada a um expoente (base^expoente).

```java
double exp(double base, double expoente) {
	double result = 1;
	for (int i = 1; i <= expoente; i++) {
		result *= base;
	}
	return result;
}
```

 Exemplo:
```
base = 3, expoente = 4 → 3 * 3 * 3 * 3 = 81
```

---

###  Raiz Quadrada (sem usar Math)

Este método foi o maior desafio, já que a raiz foi implementada **manualmente**, sem usar a classe `Math`, utilizando o **método babilônico** (também conhecido como método de Herão).

```java
double raizQuadrada(double x) {
	if (x < 0) {
		System.out.println("Error! Número não pode ser negativo.");
		return -1;
	}

	double chute = x / 2;
	double precisao = 0.00001;

	while (Math.abs(chute * chute - x) > precisao) {
		chute = (chute + x / chute) / 2;
	}

	return chute;
}
```

 Lógica:
- Começamos com um chute (metade do valor de entrada).
- Iteramos com a fórmula:
```java
chute = (chute + x / chute) / 2;
```
- A repetição para quando a diferença entre `chute²` e `x` for menor que uma margem (`precisao`).

---

###  Sequência de Fibonacci

Gera uma sequência de Fibonacci com a quantidade de termos escolhida pelo usuário.

```java
void fibo(int x) {
	int n1 = 0, n2 = 1;
	for (int qtd = x; qtd > 0; qtd--) {
		System.out.print(n1 + " ");
		int n3 = n1 + n2;
		n1 = n2;
		n2 = n3;
	}
}
```

 Exemplo (x = 6):
```
0 1 1 2 3 5
```

---

##  Tecnologias Utilizadas

- Java (JDK 8+)
- Eclipse IDE (ou VS Code)
- Lógica de programação
- Estruturas de repetição e controle
- Programação orientada a objetos

---

##  Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/calculadora-avancada-java.git
   ```
2. Abra o projeto no Eclipse ou outro ambiente Java.
3. Compile e execute a classe `Main`.
4. Siga o menu no terminal para usar as funcionalidades.

---

##  Referências

- [Método Babilônico - Raiz Quadrada](https://dialnet.unirioja.es/servlet/articulo?codigo=8704875)
- Documentação oficial do Java: [Oracle Docs](https://docs.oracle.com/javase/8/docs/api/)

