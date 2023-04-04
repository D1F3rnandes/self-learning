import java.util.Scanner;
public class Exercicio_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o valor a ser sacado: ");
        int valorSaque = input.nextInt();
        
        int notas100 = 0, notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0, notas2 = 0;
        
        if (valorSaque >= 100) {
            notas100 = valorSaque / 100;
            valorSaque = valorSaque % 100;
        }
        
        if (valorSaque >= 50) {
            notas50 = valorSaque / 50;
            valorSaque = valorSaque % 50;
        }
        
        if (valorSaque >= 20) {
            notas20 = valorSaque / 20;
            valorSaque = valorSaque % 20;
        }
        
        if (valorSaque >= 10) {
            notas10 = valorSaque / 10;
            valorSaque = valorSaque % 10;
        }
        
        if (valorSaque >= 5) {
            notas5 = valorSaque / 5;
            valorSaque = valorSaque % 5;
        }
        
        if (valorSaque >= 2) {
            notas2 = valorSaque / 2;
            valorSaque = valorSaque % 2;
        }
        
        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);
        System.out.println("Notas de 2: " + notas2);
    }
}
