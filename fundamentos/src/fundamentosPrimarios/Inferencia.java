package fundamentosPrimarios;

public class Inferencia {
	/**
	 * A inferência de tipos é uma técnica usada por 
	 * linguagens tipadas estaticamente, na qual os 
	 * tipos de variáveis podem ser inferidos de 
	 * acordo com o contexto pelo compilador;
	 * 
	 */
	public static void main(String[] args) {
		int a;
		a = 2;
		System.out.println(a);
		
		var b = 2;
		System.out.println(b);
		
		var res = a + b;
		var resposta = "Resultado da soma é " + res;
		System.out.println(resposta);
	}

}
