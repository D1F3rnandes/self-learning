package repeticao;

public class lista3 {
	public static void main(String[] args) {
		ex1();
	}
	//exercicios 1
	public static void ex1() {
		for(int i = 0; i <= 1000; i++) {
			if(i % 3 == 0) {
				System.out.printf("%d é dividível por 3%n", i);
			}
		}
		
	}

}
