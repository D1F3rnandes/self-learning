import java.util.Scanner;
public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        double num1, num2;

            System.out.println("***** Menu de Opções *****");
            System.out.println("1. Somar dois números");
            System.out.println("2. Raiz quadrada de um número");
            System.out.println("3. Elevar um número a uma potência");
            System.out.println("4. Sair do programa");
            System.out.print("Digite a opção desejada: ");
            opcao = input.nextInt();
			
            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = input.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = input.nextDouble();
                    System.out.println("A soma é: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Digite o número: ");
                    num1 = input.nextDouble();
                    System.out.println("A raiz quadrada é: " + Math.sqrt(num1));
                    break;
                case 3:
                    System.out.print("Digite o número: ");
                    num1 = input.nextDouble();
                    System.out.print("Digite a potência: ");
                    num2 = input.nextDouble();
                    System.out.println(num1 + " elevado a " + num2 + " é: " + Math.pow(num1, num2));
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            System.out.println();
    }
}


