package br.edu.unoesc.Lista25_SpringRest.ConversorNumerico;

import java.util.logging.Logger;

public class ConversorNumerico {
	static Logger logger = Logger.getLogger(ConversorNumerico.class.getName()); 
	
	public static boolean ehNumerico(String strNumero) {
		if (strNumero == null) {
			logger.info("Valor ausente!");
			return false;
		}
		String numero = strNumero.replaceAll(",", ".");
		try {
			System.out.println(Double.parseDouble(numero));
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	

	public static Double converterParDouble(String strNumero) {
		if (strNumero == null) {
			return 0d;
		}

		String numero = strNumero.replaceAll(",", ".");
		if (ehNumerico(numero)) {
			return Double.parseDouble(numero);
		}

		return 0d;

	}

}
