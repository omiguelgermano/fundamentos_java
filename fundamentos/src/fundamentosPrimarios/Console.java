package fundamentosPrimarios;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		// Saída e Entrada de dados no console
		
		// saída em linha continua
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		// saída em um linha e pulando para a proxima
		System.out.println("Bom");
		System.out.println("dia!\n");
		
		/* saída em linha, com 'format' q é utilizado para chamar a variavel.
		 * o '%n', neste caso esta sendo utilizado para quebra de linha  
		 */
		System.out.printf("Megasena: %d %d %d %d %d %d %n",
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: R$%.1f%n", 1234.56856);
		System.out.printf("Nome: %s%n", "João");
		
		/*
		 * Vamos utilizar a enrada do console.
		 * para isso utilizando a função scanner.java.util, funcção nativa do Java, 
		 * mas que precisa ser importada 
		 */
		Scanner entrada = new Scanner(System.in);// novo objeto que escaneia se ten entrada de informações no sistema
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		var sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n",
				nome, sobrenome, idade);
		
		/*
		 * Após a entrada de todos os dados necessário,
		 * lembre-se de encerrar o programa para não ficar 
		 * consumindo memória do sistema.
		 */
		entrada.close();
	}
}
