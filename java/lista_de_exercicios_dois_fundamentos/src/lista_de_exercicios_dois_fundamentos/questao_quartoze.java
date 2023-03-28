package lista_de_exercicios_dois_fundamentos;
import java.util.Scanner;
public class questao_quartoze {
	
	public static void main(String[] args) {
	
		int horaInical, horaFinal, minutoIncial, minutoFinal, duracaoH, duracaoM;
    	Scanner input = new Scanner(System.in);
	
    	System.out.print("Digite o valor da hora Inicial: ");
    	horaInical = input.nextInt();
    
    	System.out.print("Digite o valor da hora final: ");
    	horaFinal = input.nextInt();
    
    	System.out.print("Digite o valor da minuto Inicial: ");
    	minutoIncial = input.nextInt();
    
    	System.out.print("Digite o valor da minuto final: ");
    	minutoFinal = input.nextInt();

		// hora
		if(horaFinal > horaInical) {
			duracaoH = horaFinal - horaInical + 24;
		} else {
			duracaoH = horaFinal - horaInical;
		}
	
		// minuto
		duracaoM = minutoFinal- minutoIncial;
		if(minutoFinal > minutoIncial) {
			duracaoM = horaFinal - horaInical + 24;
		} else {
			duracaoM += 60;
		}
	}
}
