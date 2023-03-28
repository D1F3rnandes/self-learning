package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_onze {
    public static void main(String[] args) {
    
    System.out.println("Sabe-se que o kilowatt de energia custa 1/5 de um determinado valor de referência. \r\n"
    		+ "Crie um algoritmo que receba este valor de referência, a quantidade de kws \r\n"
    		+ "consumida por uma residência, calcule e mostre:\r\n"
    		+ "a) O valor de cada kw;\r\n"
    		+ "b) O valor a ser pago por essa residência;\r\n"
    		+ "c) O valor a ser pago considerando um bônus de 17%;\r\n"
    		+ "d) O valor a ser pago com 10 dias de atraso, sabendo que cada dia de atraso \r\n"
    		+ "acarreta um acréscimo de 0,5% sobre o valor original da conta.\r\n");
    
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de referência: R$");
        double valorReferencia = input.nextDouble();
        double valorKw = valorReferencia / 5;

        System.out.print("Digite a quantidade de kws consumida: ");
        double kwsConsumidos = input.nextDouble();

        // Calculando o valor total da conta de energia
        double valorTotal = valorKw * kwsConsumidos;

        System.out.print("\na) O valor de cada kw:");        
        // Exibindo os resultados
        System.out.printf("O valor de cada kw é: R$%.2f\n", valorKw);

        System.out.print("b) O valor a ser pago por essa residência;");  
        // Exibindo o valor total da conta sem desconto
        System.out.printf("O valor total da conta é: R$%.2f\n", valorTotal);

        System.out.print("c) O valor a ser pago considerando um bônus de 17%;"); 
        // Calculando o valor com desconto de 17%
        double valorComDesconto = valorTotal * 0.83;
        System.out.printf("O valor total com desconto de 17%% é: R$%.2f\n", valorComDesconto);

        System.out.print("d) O valor a ser pago com 10 dias de atraso, sabendo que cada dia de atraso \r\n"
        		+ "acarreta um acréscimo de 0,5% sobre o valor original da conta.");
        // Calculando o valor com acréscimo de 0,5% por dia de atraso
        System.out.print("\n\nDigite a quantidade de dias de atraso: ");
        int diasAtraso = input.nextInt();
        double valorAtraso = valorTotal * (1 + (0.005 * diasAtraso));
        System.out.printf("O valor total com acréscimo de %d dias de atraso é: R$%.2f\n", diasAtraso, valorAtraso);
    
    
    }
}

