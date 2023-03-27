package lista_e_exercícios_um_fundamentos;
public class questao_um {
	public static void main(String[] args) {
		double A,B,C,D;
		
		System.out.println("Sabendo que A = 5, B = 1, C = 3 e D = 8, crie um algoritmo que calcule os resultados e exiba-os na tela: \n\n"
				+ "A) RESULT1 = A * B - C + D\r\n"
				+ "B) RESULT2 = A * (B – C)\r\n"
				+ "C) RESULT3 = A - C * C + A\r\n"
				+ "D) RESULT4 = D * (B / 2)\r\n"
				+ "E) RESULT5 = B * D * A – C\r\n"
				+ "F) RESULT6 = (A + B + C) * D\r\n");
		
		A = 5;
		B = 1;
		C = 3;
		D = 8;
		
		System.out.println("RESULTADO:\n"
				+ "\r\nA) "+((A*B)-C+D)
				+ "\r\nB) "+(A*(B-C))
				+ "\r\nC) "+(A-(C*C)+A)
				+ "\r\nD) "+(D*(B/2))
				+ "\r\nF) "+((A+B+C)*D));
		
	}
}
