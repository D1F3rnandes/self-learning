package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;

public class questao_dez {
    public static void main(String[] args) {
        
        int VALORx;
        double resultado, valorA, valorB, valorC;
    	
        System.out.println("Crie um algoritmo que receba os valores de a, b, c e calcule a equação de segundo \r\n"
        		+ "grau formada por ax2 + bx + c = 0.");
        
        Scanner valorEntrada = new Scanner(System.in);
        System.out.println("\nDigite os valores de a, b, c");
        
        System.out.print("a:");
        valorA = valorEntrada.nextDouble();
        System.out.print("b:");
        valorB = valorEntrada.nextDouble();
        System.out.print("c:");
        valorC = valorEntrada.nextDouble();
        
        VALORx = 1;
        
        resultado = (valorA*VALORx*2)+(valorB*VALORx)+valorC;
        System.out.print("O valor x é: "+resultado);
        
    }
}
