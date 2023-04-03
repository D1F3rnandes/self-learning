import java.util.Scanner;
public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o sexo da pessoa (M ou F): ");
        String sexo = scanner.next();

        System.out.print("Digite a altura da pessoa (em cm): ");
        double altura = scanner.nextDouble();

        double pesoIdeal;

        if (sexo.equals("M")) {
            pesoIdeal = 52 + (0.75 * (altura - 152.4));
        } else if (sexo.equals("F")) {
            pesoIdeal = 52 + (0.67 * (altura - 152.4));
        } else {
            System.out.println("Sexo inválido. Digite M ou F.");
            return;
        }

        System.out.printf("O peso ideal para uma pessoa de %.2f cm e sexo %s é %.2f kg.%n", altura, sexo, pesoIdeal);
    }
}
