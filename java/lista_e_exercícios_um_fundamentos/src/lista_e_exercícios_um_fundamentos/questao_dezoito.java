package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_dezoito {
    public static void main(String[] args) {
        
        System.out.println("João recebeu seu salário e precisa pagar duas contas atrasadas. Por causa do \r\n"
        		+ "atraso, ele deverá pagar multa de 2% sobre uma conta e 3,5% sobre a outra. Crie \r\n"
        		+ "um algoritmo que calcule e mostre quanto restará do salário de João após pagar as \r\n"
        		+ "2 contas.\n");
    	
    	Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da primeira conta: ");
        double conta1 = input.nextDouble();

        System.out.print("Digite o valor da segunda conta: ");
        double conta2 = input.nextDouble();

        double multa1 = conta1 * 0.02;
        double multa2 = conta2 * 0.035;
        double total = conta1 + conta2 + multa1 + multa2;

        System.out.println("\nO valor total a ser pago é " + total);
    }
}
