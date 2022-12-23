package fundamentosPrimarios;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4; // variavel com decimal é declarada com 'double'
		final double pi = 3.14159;
		
		double area = pi * raio * raio;
		System.out.println("Área = " + area + "m2.");
		
		raio = 10;
		area = pi * area * area;
		System.out.println("Área = " + area + "m2.");
		
		
	}
}
