import java.util.*;
public class Ex5 {
    public static void main(String[] args) {

        double salario1,novosalario, percentual_decimal, aumentosalario;
        double percentual;
        Scanner entrada  = new Scanner(System.in);
        
        System.out.println("\nInsira o salario\n");
        salario1 = entrada.nextDouble();
        
        percentual_decimal = 0.25;
        percentual = percentual_decimal*100;
        aumentosalario = salario1*percentual_decimal;
        novosalario = (salario1*percentual_decimal)+salario1;
        
        System.out.println("\nO seu salario teve um aumento de "+aumentosalario+" sendo "+percentual+"%. Novo salario é de "+novosalario);
    }
    
}