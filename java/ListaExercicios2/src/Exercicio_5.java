import java.util.Scanner;
public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor3 = scanner.nextInt();

        if (valor3 > valor1 && valor3 < valor2) {
            System.out.println("O terceiro valor está entre os dois primeiros.");
        } else {
            System.out.println("O terceiro valor não está entre os dois primeiros.");
        }
    }
}
