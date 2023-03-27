package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_seis {
	public static void main(String[] args) {
		System.out.println("Crie um algoritmo que receba como entrada a base e a altura de um triângulo, \r\n"
				+ "calcule e mostre a sua área.");
        
		double numeroA, numeroB, resultadoC;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\nInsira o valor da base\n");
        numeroA = entrada.nextDouble();
        
        System.out.println("\nInsira o valor da altura\n");
        numeroB = entrada.nextDouble();
        
        resultadoC = (numeroA*numeroA)+(numeroB*numeroB);
        
        System.out.println("A area do tringulo é: "+resultadoC);
	}
}