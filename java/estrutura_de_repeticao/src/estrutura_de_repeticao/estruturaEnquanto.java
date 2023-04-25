package estrutura_de_repeticao;

public class estruturaEnquanto {
	public static void main(String[] args) {
		int potencia = 2;
		while (potencia < 2000) {
			potencia *= 2;
		}
		tabuada(5);
		imprimirQuadrado("+--",4);
	}
	static void tabuada(int numero) {
		int mult = 1;
		while(mult <= 10) {
			//System.out.printf("%d x %2d = %d%n", numero, mult, numero * mult);
			mult++;
		}
	}
	static void imprimirQuadrado(String simbolo, int lado) {
		for (int lin = 1; lin <= lado; lin++) {
			for (int col = 1; col <= lado; col++) {
				System.out.print(simbolo);
			}
			System.out.println();
		}
	}
	
}
//while (true) pode ser tambem (x < 100){
//	if (x>1 and x<10):
//		break
//}