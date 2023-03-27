package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_cinco {
	public static void main(String[] args) {
		System.out.println("Crie um algoritmo que receba o valor de um depósito e o valor da taxa de juros, \r\n"
				+ "calcule e mostre o valor do rendimento e o valor total após o rendimento.\r\n");
        
		double valorDeposito, taxaJuros, valorRendimento,valorRendimentoTotal;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\nInsira o valor do deposito\n");
        valorDeposito = entrada.nextDouble();
        
        taxaJuros = 0.15;
        valorRendimento = (valorDeposito*taxaJuros);
        valorRendimentoTotal = valorDeposito+(valorDeposito*taxaJuros);
        
        System.out.println("O valor do rendimento ficou por: "+valorRendimento+"\nSendo o valor total de rendimento: "+valorRendimentoTotal);
	}
}
