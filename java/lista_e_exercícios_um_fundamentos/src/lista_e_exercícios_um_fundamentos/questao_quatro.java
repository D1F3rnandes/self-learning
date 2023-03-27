package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_quatro {
	public static void main(String[] args) {
		System.out.println("Crie um algoritmo que receba o salário bruto de um funcionário e exiba o seu salário \r\n"
				+ "líquido, sabendo que ele tem 10% de gratificação sobre o salário base e tem 15% \r\n"
				+ "de descontos sobre o salário após a gratificação.\r\n");
        
		double salarioBruto, descontoSalario, dezPorCentoSalario;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\nInsira o salario\n");
        salarioBruto = entrada.nextDouble();
        
        dezPorCentoSalario = (salarioBruto*0.10)+salarioBruto;
        descontoSalario = dezPorCentoSalario-(dezPorCentoSalario*0.15);
        
        System.out.println("Valor do salario com a bonificação ficou: "+dezPorCentoSalario+"\nValor do salario com todos os descontos: "+descontoSalario);
	}
}
