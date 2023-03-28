package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_quatorze {
    public static void main(String[] args) {
    	
    	System.out.println("Um trabalhador recebeu seu salário e o depositou em sua conta bancária. Esse \r\n"
    			+ "trabalhador emitiu dois cheques e agora deseja saber seu saldo atual. Sabe-se que \r\n"
    			+ "cada operação bancária de retirada paga CPMF de 0,38% e o saldo inicial da conta \r\n"
    			+ "está zerado.\n");
    	
    	Scanner input = new Scanner(System.in);

    	System.out.print("Digite o valor do salário depositado (em reais): ");
    	double salario = input.nextDouble();

    	System.out.print("Digite o valor do primeiro cheque emitido (em reais): ");
    	double cheque1 = input.nextDouble();

    	System.out.print("Digite o valor do segundo cheque emitido (em reais): ");
    	double cheque2 = input.nextDouble();

    	double saldo = salario - (cheque1 + cheque2);
    	saldo -= saldo * 0.0038; // desconto da CPMF

    System.out.println("\nSeu saldo atual é de R$" + saldo);
    }
}
