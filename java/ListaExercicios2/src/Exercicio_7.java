import java.util.Scanner;
public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota (de 0 a 100): ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota (de 0 a 100): ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota (de 0 a 100): ");
        double nota3 = scanner.nextDouble();

        double media = ((nota1 * 2) + (nota2 * 2) + (nota3 * 4)) / 8;

        System.out.printf("Notas: %.2f, %.2f, %.2f%n", nota1, nota2, nota3);
        System.out.printf("Média: %.2f%n", media);

        if (media >= 50) {
            System.out.println("APROVADO");
        } else if (media >= 45 && media < 50) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
