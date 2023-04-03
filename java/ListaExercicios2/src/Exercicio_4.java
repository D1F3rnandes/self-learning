import java.util.Scanner;
public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor entre 1 e 30: ");
        int valor = scanner.nextInt();

        if (valor >= 1 && valor <= 30) {
            System.out.println("O valor está dentro da faixa permitida.");
        } else {
            System.out.println("O valor está fora da faixa permitida.");
        }
    }
}
