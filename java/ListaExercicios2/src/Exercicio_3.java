import java.util.Scanner;
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("\nAluno: " + nome);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4);
        System.out.println("Média: " + media);

        switch ((int) media / 20) {
            case 0:
                System.out.println("Classificação: Péssimo");
                break;
            case 1:
                System.out.println("Classificação: Ruim");
                break;
            case 2:
                System.out.println("Classificação: Regular");
                break;
            case 3:
            case 4:
                System.out.println("Classificação: Bom");
                break;
            default:
                System.out.println("Classificação: Ótimo");
        }
    }
}
