import java.util.Scanner;
public class Exercicio_18 {
	public static void main(String[] args) {
	    
	    Scanner escreva = new Scanner(System.in);
	    
	    // Recebe as notas do aluno
	    System.out.print("Digite a primeira nota do aluno: ");
	    double nota1 = escreva.nextDouble();
	    
	    System.out.print("Digite a segunda nota do aluno: ");
	    double nota2 = escreva.nextDouble();
	    
	    System.out.print("Digite a terceira nota do aluno: ");
	    double nota3 = escreva.nextDouble();
	    
	    System.out.print("Digite a quarta nota do aluno: ");
	    double nota4 = escreva.nextDouble();
	    
	    // Recebe a quantidade de aulas dadas e presenças do aluno
	    System.out.print("Digite a quantidade de aulas dadas: ");
	    int aulasDadas = escreva.nextInt();
	    
	    System.out.print("Digite a quantidade de presenças do aluno: ");
	    int presencas = escreva.nextInt();
	    
	    // Verifica se o aluno tem direito a excursão
	    if (nota1 + nota2 + nota3 + nota4 >= 320 && presencas == aulasDadas) {
	        System.out.println("O aluno tem direito à Excursão.");
	    }
	    // Verifica se o aluno tem direito à camiseta
	    else if (nota1 + nota2 + nota3 + nota4 >= 320 || presencas == aulasDadas) {
	        System.out.println("O aluno tem direito à Camiseta.");
	    }
	    // Verifica se o aluno tem direito ao squeeze
	    else if (nota1 + nota2 + nota3 + nota4 >= 280 && presencas == aulasDadas) {
	        System.out.println("O aluno tem direito ao Squeeze.");
	    }
	    // Verifica se o aluno tem direito à caneta personalizada
	    else if (nota1 + nota2 + nota3 + nota4 >= 280 || presencas == aulasDadas) {
	        System.out.println("O aluno tem direito à Caneta personalizada.");
	    }
	    // Caso contrário, informa que não há prêmios
	    else {
	        System.out.println("O aluno não tem direito a nenhum prêmio.");
	    }
	}

}


