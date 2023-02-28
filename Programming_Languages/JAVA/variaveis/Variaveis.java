package variaveis;
public class Variaveis {
    public static void main(String[] args) {
        
        //declaração de variaveis
        byte idade = 10;
        int ano = 2023;
        double peso = 85.5;
        float altura = 1.90f; //necessario colocar esse letra F para força a atribução de float.
        char letra = 'A';
        char letra2 = '\u0070';
        char letra3 = 78;
        String nome = "Romeu";
        final double PI = 3.1415;
        long milisec = System.currentTimeMillis();
        
        //exibindo comentario na tela
        System.out.println(letra);
        System.out.println(letra2);
        System.out.println(letra3);
        System.out.println(idade);
        System.out.println(ano);
        System.out.println(peso);
        System.out.println(altura);
        System.out.println(nome);
        System.out.println(PI);
        
        //Tempo de executação
        System.out.println("Tempo de execução do programa: ");
        System.out.println(System.currentTimeMillis()- milisec);
    }
    
}