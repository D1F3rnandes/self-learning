package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_tres {
	public static void main(String[] args) {
		System.out.println("Crie um algoritmo que receba o nome e o salário de um funcionário, calcule seu \r\n"
				+ "novo salário sabendo que ele recebeu um aumento de 25% e mostre uma frase com \r\n"
				+ "o nome, o valor do aumento e o novo salário.\r\n");
        
		double salario1,novoSalario, percentualDecimal, aumentoSalario, percentual;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nInsira o salario\n");
        salario1 = entrada.nextDouble();
        
        percentualDecimal = 0.25;
        percentual = percentualDecimal*100;
        aumentoSalario = salario1*percentualDecimal;
        novoSalario = (salario1*percentualDecimal)+salario1;
        
        System.out.println("\nO seu salario teve um aumento de "+aumentoSalario+" sendo "+percentual+"%. Novo salario é de "+novoSalario);	
	}
}
