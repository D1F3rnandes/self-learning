package repeticao;

import java.util.Scanner;

public class lista3 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		//ex1();
		//ex2();
		//ex3();
		//ex4();
		ex5();
		//ex6();
		//ex7();
		//ex8();
		//ex9();
		//ex10();
		
	}
	
	//exercicios 1
	public static void ex1() {
		for(int i = 0; i <= 1000; i++) {
			if(i % 3 == 0) {
				System.out.printf("%d é dividível por 3%n", i);
			}
		}
		
	}
	
	//exercicios 2	
	public static void ex2() {
		for(int i = 1; i <= 250; i++) {
			if(i % 10 == 0) {
				System.out.printf("%d é múltiplo de 10%n", i);
			}
		}
		
	}
	
	//exercicios 3
	public static void ex3() {
		int soma = 0;
		
		for(int i = 1; i <= 100; i++) {
			soma += i;
		}
		System.out.printf("%d %n", soma);
	}
	
	//exercicios 4
	public static void ex4() {
		System.out.print("Digite um número: ");
		int numeroEscolhido = input.nextInt();
		int soma = 0;
		
		for(int i = 1; i <= numeroEscolhido; i++) {
			soma += i;
		}
		System.out.printf("%d %n", soma);
	}
	
	//exercicios 5
	public static void ex5() {
		System.out.print("Digite um número: ");
		int numeroEscolhido = input.nextInt();
		int numero = 1;
		
		for(int i = numeroEscolhido; i >= 1; --i) {
			numero *= i;
		}
		System.out.printf("O fato de %d é igual a %d%n", numeroEscolhido, numero);
	}
	//exercicios 6
	public static void ex6() {}
	//exercicios 7
	public static void ex7() {}
	//exercicios 8
	public static void ex8() {}
	//exercicios 9
	public static void ex9() {}
	//exercicios 10	
	public static void ex10() {}

}
