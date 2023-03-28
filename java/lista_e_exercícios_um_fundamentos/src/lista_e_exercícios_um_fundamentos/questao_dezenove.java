package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_dezenove {
    public static void main(String[] args) {
        
        System.out.println(" Crie um algoritmo que leia o tempo de duração de um evento expressa em segundos \r\n"
        		+ "e mostre-o em horas, minutos e milissegundos.");
    	
    	Scanner input = new Scanner(System.in);

        System.out.print("\nDigite o tempo de duração do evento em segundos: ");
        int segundos = input.nextInt();

        int horas = segundos / 3600;
        segundos %= 3600;

        int minutos = segundos / 60;
        segundos %= 60;

        int milissegundos = segundos * 1000;

        System.out.println(horas + " horas, " + minutos + " minutos, " + segundos + " segundos e " + milissegundos + " milissegundos.");
    }
}
