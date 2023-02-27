import java.util.*;
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        double n1,n2,n3,p1,p2,p3,mp;
        Scanner entrada  = new Scanner(System.in);
        
        System.out.println("\nInsira os valores das notas\n");
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        n3 = entrada.nextDouble();
        
        System.out.println("\nInsira os pesos\n");
        p1 = entrada.nextDouble();
        p2 = entrada.nextDouble();
        p3 = entrada.nextDouble();
        
        mp = (n1*p1+n2*p2+n3*p3)/(p1+p2+p3);
        
        System.out.println("\nMédia = "+mp);
    }
    
}