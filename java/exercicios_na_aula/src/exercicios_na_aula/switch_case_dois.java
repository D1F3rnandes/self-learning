package exercicios_na_aula;
import java.util.Scanner;
public class switch_case_dois {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	String codigoNumero, nomeCargo;
    	double salarioAtual, aumentoSalario;
    	int quantidade;
    	
    	System.out.println("Código");
    	codigoNumero = input.nextLine();
    	System.out.println("Salario");
    	salarioAtual = input.nextInt();
    	
    	switch (codigoNumero.toUpperCase()) {
    	case "1":
    		aumentoSalario = (salarioAtual*0.5)+salarioAtual;
    		System.out.println();
    		break;
    	case "2":
    		aumentoSalario = (salarioAtual*0.35)+salarioAtual;
    		System.out.println();
    		break;
    	case "3":
    		aumentoSalario = (salarioAtual*0.20)+salarioAtual;
    		System.out.println();
    		break;
    	case "4":
    		aumentoSalario = (salarioAtual*0.10)+salarioAtual;
    		System.out.println();
    		break;
    	case "5":
    		aumentoSalario = (salarioAtual*0)+salarioAtual;
    		System.out.println();
    		break;
    	default:
    		aumentoSalario = 0;
    	    System.out.println("Código Invalido");
    		System.exit(0);
    	}    	
    	System.out.printf("Salario: "+aumentoSalario);
    }
}
