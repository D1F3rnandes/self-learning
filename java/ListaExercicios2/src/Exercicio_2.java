import java.util.Scanner;
public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
    
        System.out.print("Digite o primeiro número: ");
        int num1 = escreva.nextInt();
    
        System.out.print("Digite o segundo número: ");
        int num2 = escreva.nextInt();
    
        System.out.print("Digite o terceiro número: ");
        int num3 = escreva.nextInt();
    
        int menor = num1;
    
        if (num2 < menor) {
            menor = num2;
        }
    
        if (num3 < menor) {
            menor = num3;
        }
    
        System.out.println("O menor número é: " + menor);
    }
    
}
