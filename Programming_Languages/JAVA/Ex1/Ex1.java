package Ex1;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        double n1,n2,n3,m;
        Scanner entrada  = new Scanner(System.in);
        System.out.println("\nInsira os valores das notas\n");
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        n3 = entrada.nextDouble();
        m =(n1+n2+n3)/3.0;
        System.out.println("\nMédia = "+m);
    }
    
}