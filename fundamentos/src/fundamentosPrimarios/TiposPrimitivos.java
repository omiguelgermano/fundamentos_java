package fundamentosPrimarios;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // Literal do tipo Long
		
		// Tipos numéricos reais
		float salario = 11_445.44F; // Literal do tipo Float
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // or true
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		// Dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);
		
		// Números de viagens
		System.out.println("Número de voos: " + numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println("Total de pontos: " + pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}	
}
