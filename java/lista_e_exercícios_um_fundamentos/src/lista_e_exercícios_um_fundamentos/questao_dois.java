package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_dois {
	public static void main(String[] args) {
		System.out.println("Crie um algoritmo que receba três notas e seus respectivos pesos, calcule e mostre \r\n"
				+ "a média ponderada entre elas.\r\n");
		double n1,n2,n3,p1,p2,p3,mp;
        Scanner entrada = new Scanner(System.in);
            System.out.println("\nInsira os valores das notas:");
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();
            n3 = entrada.nextDouble();
            
            System.out.println("\nInsira os pesos:");
            p1 = entrada.nextDouble();
            p2 = entrada.nextDouble();
            p3 = entrada.nextDouble();
        
        mp = (n1*p1+n2*p2+n3*p3)/(p1+p2+p3);
        
        System.out.println("\nMédia = "+mp);
	}

}
