package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_dezesseis {
    public static void main(String[] args) {
        
        System.out.println("Sabe-se que 1 pé = 12 polegadas, 1 jarda = 3 pés, 1 milha = 1760 jardas. Crie \r\n"
        		+ "um algoritmo que receba uma medida em pés, faça as conversões e mostre os \r\n"
        		+ "resultados em:\r\n"
        		+ "a) Polegadas;\r\n"
        		+ "b) Jardas;\r\n"
        		+ "c) Milhas\r\n");
    	
    	Scanner input = new Scanner(System.in);

        System.out.print("Digite a medida em pés: ");
        double pes = input.nextDouble();

        double polegadas = pes * 12;
        double jardas = pes / 3;
        double milhas = pes / (1760 * 3);

        System.out.println("A medida em polegadas é " + polegadas);
        System.out.println("A medida em jardas é " + jardas);
        System.out.println("A medida em milhas é " + milhas);
    }
}
