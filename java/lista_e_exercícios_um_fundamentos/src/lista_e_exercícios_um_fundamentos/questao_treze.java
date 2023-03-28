package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_treze {
    public static void main(String[] args) {
        
        System.out.println("Pedro comprou um saco de ração com peso em Kg. Ele possui dois gatos, para os \r\n"
        		+ "quais fornece a quantidade de ração em gramas. A quantidade diária de ração \r\n"
        		+ "fornecida para cada gato é sempre a mesma. Crie um algoritmo que receba o peso \r\n"
        		+ "do saco de ração e a quantidade de ração fornecida para cada gato, calcule e mostre \r\n"
        		+ "quanto restará de ração no saco após cinco dias.\n");
    	
    	Scanner input = new Scanner(System.in);

        System.out.print("Digite o peso do saco de ração (em kg): ");
        double pesoRacao = input.nextDouble();

        System.out.print("Digite a quantidade de ração fornecida diariamente para cada gato (em gramas): ");
        double qtdRacaoGato = input.nextDouble();

        double qtdRacaoTotal = qtdRacaoGato * 2 * 5 / 1000; // total em kg
        double restoRacao = pesoRacao - qtdRacaoTotal;

        System.out.println("\nRestarão " + restoRacao + " kg de ração no saco após cinco dias.");
    }
}
