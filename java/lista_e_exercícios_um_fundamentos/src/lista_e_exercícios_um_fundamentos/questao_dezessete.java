package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_dezessete {
	public static void main(String[] args) {
       
        System.out.println("Crie um algoritmo que receba os valores dos catetos de um triângulo, calcule e \r\n"
        		+ "mostre o valor da hipotenusa.\r\n"
        		+ "");
		
		Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro cateto: ");
        double cateto1 = input.nextDouble();

        System.out.print("Digite o valor do segundo cateto: ");
        double cateto2 = input.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("\nO valor da hipotenusa é " + hipotenusa);
    }
}
