package fundamentosPrimarios;

public class Temperatura {
	
	public static void main(String[] args) {
		// (ºF - 32) * 5/9 = ºC
		
		final double ajuste = 32;
		final double fator = 5.0/9.0;
		double fahrenheit = 92;
		
		double celsius = (fahrenheit - ajuste) * fator;
		System.out.println("resultado: " + celsius + "ºC");	
		
		
		fahrenheit = 125;
		celsius = (fahrenheit - ajuste) * fator;
		System.out.println("resultado: " + celsius + "ºC");	
	}

}
