import java.util.Scanner;
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite as notas do Aluno");
        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double nota3 = entrada.nextDouble();
        double nota4 = entrada.nextDouble();

        double media = (nota1+nota2+nota3+nota4)/4;

        

        
    }
}
