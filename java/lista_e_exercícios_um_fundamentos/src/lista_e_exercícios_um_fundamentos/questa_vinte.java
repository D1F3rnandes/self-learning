package lista_e_exercícios_um_fundamentos;
import java.util.Scanner;
public class questa_vinte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de dias: ");
        int dias = sc.nextInt();
        
        int horas = dias * 24;
        double meses = dias / 30.0;
        double trimestres = dias / 90.0;
        double semestres = dias / 180.0;
        double anos = dias / 365.0;
        double decadas = anos / 10.0;
        
        System.out.println(dias + " dias equivalem a:");
        System.out.println(horas + " horas");
        System.out.println(meses + " meses");
        System.out.println(trimestres + " trimestres");
        System.out.println(semestres + " semestres");
        System.out.println(anos + " anos");
        System.out.println(decadas + " décadas");
    }
}
