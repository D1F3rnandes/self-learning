import java.util.Scanner;
public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = escreva.nextInt();
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            int proximoBissexto = ano + (4 - ano % 4);
            if (proximoBissexto % 100 == 0 && proximoBissexto % 400 != 0) {
                proximoBissexto += 4;
            }
            System.out.println(ano + " não é um ano bissexto. O próximo ano bissexto é " + proximoBissexto + ".");
        }
    }
}


