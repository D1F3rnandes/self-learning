package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_doze {
    public static void main(String[] args) {
        
    	System.out.println("Cada degrau de uma escada tem X de altura. Crie um algoritmo que receba essa \r\n"
    			+ "altura e a altura que o usuário deseja alcançar subindo a escada e mostre quantos \r\n"
    			+ "degraus ele deverá subir para atingir seu objetivo, sem se preocupar com a altura \r\n"
    			+ "do usuário. Todas as medidas fornecidas devem estar em metros\n");
    	
    	Scanner input = new Scanner(System.in);

        int alturaDegrau, alturaDesejada, numDegraus;
        
        System.out.print("Digite a altura de cada degrau (em metros): ");
        alturaDegrau = input.nextInt();

        System.out.print("Digite a altura que deseja alcançar (em metros): ");
        alturaDesejada = input.nextInt();

        numDegraus = (alturaDesejada / alturaDegrau);

        System.out.println("Você precisará subir " + numDegraus + " degraus.");
    }
}