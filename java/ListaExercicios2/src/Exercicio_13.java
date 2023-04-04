import java.util.Scanner;
public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        System.out.println("Digite a hora de início do jogo:");
        int horaInicio = escreva.nextInt();
        int minutoInicio = escreva.nextInt();

        System.out.println("Digite a hora de término do jogo:");
        int horaTermino = escreva.nextInt();
        int minutoTermino = escreva.nextInt();
        int duracaoHoras, duracaoMinutos;

        if (horaInicio < horaTermino) {
            duracaoHoras = horaTermino - horaInicio;
        } else if (horaInicio > horaTermino) {
            duracaoHoras = 24 - horaInicio + horaTermino;
        } else {
            duracaoHoras = 24;
        }
		
        if (minutoInicio < minutoTermino) {
            duracaoMinutos = minutoTermino - minutoInicio;
        } else {
            duracaoMinutos = 60 - minutoInicio + minutoTermino;
            duracaoHoras--;
        }
		
        System.out.printf("Duração do jogo: %d horas e %d minutos%n", duracaoHoras, duracaoMinutos);
		
         
    }
}
