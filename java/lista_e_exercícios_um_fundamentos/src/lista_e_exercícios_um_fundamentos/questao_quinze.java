package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questao_quinze {
    public static void main(String[] args) {
        System.out.println("Crie um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, \r\n"
        		+ "calcule e mostre:\r\n"
        		+ "a) A idade dessa pessoa;\r\n"
        		+ "b) Quantos dias de vida aproximadamente essa pessoa terá vivido em 2050.\n");
    	
    	Scanner input = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = input.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = input.nextInt();

        int idade = anoAtual - anoNascimento;
        int diasVida = idade * 365; // aproximadamente

        int anosRestantes = 2050 - anoNascimento;
        int diasVida2050 = anosRestantes * 365; // aproximadamente

        System.out.print("a) A idade dessa pessoa");
        System.out.println("A idade da pessoa é " + idade + " anos.");
        System.out.print("b) Quantos dias de vida aproximadamente essa pessoa terá vivido em 2050.");
        System.out.println("Em 2050, a pessoa terá vivido aproximadamente " + diasVida2050 + " dias.");
    }
}
