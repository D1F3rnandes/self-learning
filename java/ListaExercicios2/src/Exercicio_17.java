import java.util.Scanner;
public class Exercicio_17 {
	    public static void main(String[] args) {
	        Scanner escreva = new Scanner(System.in);

	        System.out.print("Digite a primeira nota: ");
	        double nota1 = escreva.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        double nota2 = escreva.nextDouble();

	        System.out.print("Digite a terceira nota: ");
	        double nota3 = escreva.nextDouble();

	        double media = (nota1 + nota2 + nota3) / 3;

	        if (media >= 6) {
	            System.out.println("Aluno aprovado");
	        } else if (media < 5) {
	            System.out.println("Aluno reprovado");
	        } else {
	            System.out.println("Aluno em recuperação. Digite a nota da atividade de recuperação: ");
	            double notaRec = escreva.nextDouble();
	            double novaMedia = (media + notaRec) / 2;
	            if (novaMedia < 6) {
	                System.out.println("Aluno reprovado");
	            } else {
	                System.out.println("Aluno aprovado por recuperação");
	            }
	        }
	    }
	}


