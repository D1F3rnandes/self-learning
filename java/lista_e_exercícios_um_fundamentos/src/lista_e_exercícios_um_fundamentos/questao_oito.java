package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_oito {
	    public static void main(String[] args) {
	        
	    	Scanner entrada = new Scanner(System.in);
	        System.out.print("Digite um número para ver a sua tabuada: ");
	        int numTabuada = entrada.nextInt();
	        
	        System.out.println("\nA tabuada de "+numTabuada+":");
	        
	    	System.out.println(numTabuada+"x0 = "+(numTabuada*0));	        
	    	System.out.println(numTabuada+"x1 = "+(numTabuada*1));
	    	System.out.println(numTabuada+"x2 = "+(numTabuada*2));
	    	System.out.println(numTabuada+"x3 = "+(numTabuada*3));
	    	System.out.println(numTabuada+"x4 = "+(numTabuada*4));
	    	System.out.println(numTabuada+"x5 = "+(numTabuada*5));
	    	System.out.println(numTabuada+"x6 = "+(numTabuada*6));
	    	System.out.println(numTabuada+"x7 = "+(numTabuada*7));
	    	System.out.println(numTabuada+"x8 = "+(numTabuada*8));
	    	System.out.println(numTabuada+"x9 = "+(numTabuada*9));
	    	System.out.println(numTabuada+"x10 = "+(numTabuada*10));
	    }
}
