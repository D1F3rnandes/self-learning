package Ex5;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {

        double salario1,novoSalario, percentualDecimal, aumentoSalario;
        double percentual;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("\nInsira o salario\n");
            salario1 = entrada.nextDouble();
        }
        
        percentualDecimal = 0.25;
        percentual = percentualDecimal*100;
        aumentoSalario = salario1*percentualDecimal;
        novoSalario = (salario1*percentualDecimal)+salario1;
        
        System.out.println("\nO seu salario teve um aumento de "+aumentoSalario+" sendo "+percentual+"%. Novo salario é de "+novoSalario);
    }
    
}