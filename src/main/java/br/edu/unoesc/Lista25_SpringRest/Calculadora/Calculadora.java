package br.edu.unoesc.Lista25_SpringRest.Calculadora;

public class Calculadora {
	public static Double somar(Double numero1, Double numero2) {
		Double resultado = numero1 + numero2;
		return resultado;
	}
	
	public static Double subtrair(Double numero1, Double numero2) {
		return numero1 - numero2;
	}
	
	public static Double multiplicar(Double numero1, Double numero2) {
		return numero1 * numero2;
	}
	
	public static Double dividir(Double numero1, Double numero2) {
		return numero1 / numero2;
	}
	
	public static Double media (Double numero1, Double numero2) {
		return (numero1 + numero2) / 2;
	}
	
	public static Double potencia (Double numero1, Double numero2) {
		return Math.pow(numero1, numero2);
	}
	
	public static Double raizQuadrada (Double numero) {
//		if (numero < 0)  {			
//			throw new RuntimeException("ERRO!!! NÃO É POSSÍVEL OBTER A RAIZ QUADRADA DE UM NÚMERO NEGATIVO");
//		} else {
			return Math.sqrt(numero);			
//		}
		
	}
}
