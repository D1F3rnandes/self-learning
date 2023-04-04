import java.util.Scanner;
public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        
		System.out.println("Digite o valor do lado X:");
        double x = escreva.nextDouble();
        
		System.out.println("Digite o valor do lado Y:");
        double y = escreva.nextDouble();
        
		System.out.println("Digite o valor do lado Z:");
        double z = escreva.nextDouble();
        
		if (x < y + z && y < x + z && z < x + y) {
            if (x == y && y == z) {
                System.out.println("Triângulo equilátero");
            } else if (x == y || y == z || x == z) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
         
    }
}


