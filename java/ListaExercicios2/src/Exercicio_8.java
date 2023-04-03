import java.util.Scanner;
public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário base: ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Digite a gratificação: ");
        double gratificacao = scanner.nextDouble();

        double salarioBruto = salarioBase + gratificacao;
        double imposto;

        if (salarioBruto < 2500.00) {
            imposto = salarioBruto * 0.10;
        } else {
            imposto = salarioBruto * 0.15;
        }

        double salarioLiquido = salarioBruto - imposto;

        System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Gratificação: R$ %.2f%n", gratificacao);
        System.out.printf("Imposto: R$ %.2f%n", imposto);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);
    }
}
