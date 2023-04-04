package exercicios_na_aula;
import java.util.Scanner;

public class ExemploMetodos {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String nome;
        double num1, num2, soma, media;
        
        saudacao("Diego");

        System.out.println("Informe dois numeros");

        num1 = teclado.nextDouble();
        num2 = teclado.nextDouble();

        soma = somar(num1, num2);
        media = calcularMedia(num1, num2);

        System.out.println("A soma é "+soma);
        System.out.println("A media é "+media);
    }
    public static double somar(double n1, double n2){
        double soma;
        soma = n1 + n2;
        return soma;
    }
    public static double calcularMedia(double n1, double n2){
        double media;
        media = (n1+n2)/2;
        return media;
    }
    public static void saudacao(String nome){
        System.out.println("Olá "+nome);
    }

    public static String saudar(String nome){
        return  "olá "+ nome;
    }
}
