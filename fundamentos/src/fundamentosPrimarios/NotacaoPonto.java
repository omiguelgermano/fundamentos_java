package fundamentosPrimarios;

public class NotacaoPonto {
	// Tipo primitivos não tem o operador "."(ponto ou seja, ñ tem notação ponto)

	public static void main(String[] args) {
		
		String s = "Boa noite X";
		// Alguns metodos building do JAVA
		s = s.replace("X", "Dr."); // Substituição de string
		s = s.toUpperCase(); // MAIÚSCULOS
		s = s.concat("!!!"); // concatenação
		
		System.out.println(s);
		
		System.out.println("Miguel".toUpperCase());
		
		String y = "Boa noite X"
				.replace("X", "Miguel")
				.concat(", seja bem-vindo!!!")
				.toUpperCase();
		System.out.println(y);
		
		// Tipo primitivos não tem o operador "."(ponto ou seja, ñ tem notação ponto)
		
	}
}
