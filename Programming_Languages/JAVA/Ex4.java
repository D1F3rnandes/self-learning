package ex4;
import java.util.*;
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double salario1,novosalario;
        Scanner entrada  = new Scanner(System.in);
        
        System.out.println("\nInsira o salario\n");
        salario1 = entrada.nextDouble();

        novosalario = (salario1*0.25)+salario1;
        
        System.out.println("\nNovo salario é de "+novosalario);
    }
    
}