package fundamentosPrimarios;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Olá Pessoal!".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("bOa tArdE"));
		System.out.println("\n\n");
		
		// Exemplos de concatenação
		var nome = "Miguel";
		var sobrenome = "Germano";
		var idade = 33;
		var salario = 10590.895;
		
		// Exemplo 1:
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome
				+ "\nIdade: " + idade + "\nSalario: R$" + salario + "\n\n");
		
		// Exemplo 2: 
		System.out.printf("O senhor %s %s tem %d anos e recebe um salário de R$%.2f.", 
				nome, sobrenome, idade, salario);
		
		// Exemplo 3:
		String frase = String.format("\nO senhor %s %s tem %d anos e recebe um salário de R$%.2f.", 
				nome, sobrenome, idade, salario); 
		System.out.println(frase + "\n");
		
		// Outra funcionalidades da String
		System.out.println("Frase qualquer".contains("se"));
		System.out.println("Frase qualquer".indexOf("se"));
		System.out.println("Frase qualquer".substring(3));
		System.out.println("Frase qualquer".substring(0, 5));
		
	}
}
