package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_sete {
	public static void main(String[] args) {
		System.out.println("Crie um algoritmo que receba o raio de um círculo, calcule e mostre a sua área e o \r\n"
				+ "seu perímetro.");
        
		double circuferencia, numeroPI, resultado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\nInsira o valor da circuferencia");
        circuferencia = entrada.nextDouble();
        
        numeroPI = 3.14;
        resultado = circuferencia*numeroPI;
        
        System.out.println("\nA area do circulo é: "+resultado);
	}
}
