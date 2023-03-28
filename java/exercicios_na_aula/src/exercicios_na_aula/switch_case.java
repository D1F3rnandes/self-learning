package exercicios_na_aula;
import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	String planoValor = input.nextLine();
    	double valor;
    	
    	switch (planoValor.toLowerCase()) {
    	case "basico":
    	case "básico":
    		valor = 150;	
    		System.out.println();
    		break;
    	case "bronze":
    		valor = 220;
    		break;
    	case "prata":
    		valor = 310;
    		break;
    	case "ouro":
    		valor = 450;
    		break;
    		default:
    			valor = 0;
    			System.exit(0);
    	}
    	System.out.printf("Plano: %s. Valor: R$ %.2f", planoValor, valor);
    }
}