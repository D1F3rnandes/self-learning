package estrutura_de_repeticao;
import java.util.Scanner;
public class EstruturaFor {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Informe um nÃºmero para calcular a tabuada");
		numero = teclado.nextInt();
		// Exibe a tabuada do nÃºmero atÃ© 10
		tabuadaFor(numero, 10);
		// Informa se Ã© primo ou nÃ£o
		if (ehPrimo(numero)) {
			System.out.println("NÃºmero Primo");
		} else {
			System.out.println("NÃ£o Ã© Primo");
		}
		// exibe o resultado da equaÃ§Ã£o N2 = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!
		System.out.println(calculaN2(numero));
		// imprime o sÃ­mbolo x vezes
		imprimir("+", 15);
		// imprime um quadrado de lado x com o sÃ­mbolo
		imprimirQuadrado("+", 5);
		teclado.close();
	}

	// calcula a tabuada de um nÃºmero atÃ© o limite
	static void tabuadaFor(int num, int limite) {
		for (int i = 1; i <= limite; i++) {
			System.out.printf("%2d * %2d = %3d%n", num, i, num * i);
		}
	}

	// verifica se o nÃºmero Ã© primo
	static boolean ehPrimo(int numero) {
		int qtde = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				qtde++;
			}
			if (qtde == 2) {
				break;
			}
		}
		return qtde > 2 ? false : true;
	}

	// N2 = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!
	static double calculaN2(int n) {
		int fat;
		double n2 = 1;
		for (int i = 1; i <= n; i++) {
			fat = 1;
			for (int j = 1; j <= i; j++) {
				fat = fat * j;
			}
			n2 = n2 + 1.0 / fat;
		}
		return n2;
	}

	// imprime o sÃ­mbolo x vezes em uma linha
	static void imprimir(String simbolo, int vezes) {
		for (int i = 1; i <= vezes; i++) {
			System.out.print(simbolo);
		}
	}

	// imprime um quadrado com o sÃ­mbolo com lado tamanho x
	static void imprimirQuadrado(String simbolo, int lado) {
		for (int lin = 1; lin <= lado; lin++) {
			for (int col = 1; col <= lado; col++) {
				System.out.print(simbolo);
			}
			System.out.println();
		}
	}
}
