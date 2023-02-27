import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {

        double salario1,novosalario;
        Scanner entrada  = new Scanner(System.in);
        
        System.out.println("\nInsira o salario\n");
        salario1 = entrada.nextDouble();

        novosalario = (salario1*0.25)+salario1;
        
        System.out.println("\nNovo salario é de "+novosalario);
    }
    
}