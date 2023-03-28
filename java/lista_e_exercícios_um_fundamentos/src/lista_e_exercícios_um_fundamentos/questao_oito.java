package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_oito {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um número para ver a sua tabuada: ");
	        int num = sc.nextInt();
	        
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }
	        
	        sc.close();
	    }
}
