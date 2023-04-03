import java.util.Scanner;
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = escreva.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = escreva.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " é maior que " + num1);
        } else {
            System.out.println(num1 + " e " + num2 + " são iguais");
        }
    }
}
