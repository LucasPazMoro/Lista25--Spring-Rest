package br.edu.unoesc.Lista25_SpringRest.Controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unoesc.Lista25_SpringRest.Calculadora.Calculadora;
import br.edu.unoesc.Lista25_SpringRest.ConversorNumerico.ConversorNumerico;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {
	private Logger logger = Logger.getLogger(CalculadoraController.class.getName());

//---------------------SOMAR-----------------------------------------------------------------------------------//
	@GetMapping("/somar-query")
	public Double somarQuery(@RequestParam(value = "numero1", defaultValue = "0") Double numero1,
			@RequestParam(value = "numero2", defaultValue = "0") Double numero2) {
		return Calculadora.somar(numero1, numero2);
	     
	}

	@RequestMapping(value = "/somar-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double somarPath(@PathVariable("numero1") String numero1, @PathVariable("numero2") String numero2) {

		logger.info("Calculando...  " + numero1 + " + " + numero2);

		if (!ConversorNumerico.ehNumerico(numero1) || !ConversorNumerico.ehNumerico(numero2)) {
			return 0d;
		}
		return Calculadora.somar(ConversorNumerico.converterParDouble(numero1),
				ConversorNumerico.converterParDouble(numero2));
	}

//---------------------SUBTRAIR-----------------------------------------------------------------------------------//
	@GetMapping("/subtrair-query")
	public Double subtrairQuery(@RequestParam(value = "numero1", defaultValue = "0") Double numero1,
			@RequestParam(value = "numero2", defaultValue = "0") Double numero2) {
		return Calculadora.subtrair(numero1, numero2);

	}

	@RequestMapping(value = "/subtrair-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double subtrairPath(@PathVariable("numero1") String numero1, @PathVariable("numero2") String numero2) {

		logger.info("Calculando...  " + numero1 + " - " + numero2);

		if (!ConversorNumerico.ehNumerico(numero1) || !ConversorNumerico.ehNumerico(numero2)) {
			return 0d;

		}
		return Calculadora.subtrair(ConversorNumerico.converterParDouble(numero1),
				ConversorNumerico.converterParDouble(numero2));
	}

//---------------------MULTIPLICAR-----------------------------------------------------------------------------------//
	@GetMapping("/multiplicar-query")
	public Double multiplicarQuery(@RequestParam(value = "numero1", defaultValue = "0") Double numero1,
			@RequestParam(value = "numero2", defaultValue = "0") Double numero2) {
		return Calculadora.multiplicar(numero1, numero2);

	}

	@RequestMapping(value = "/multiplicar-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double multiplicarPath(@PathVariable("numero1") String numero1, @PathVariable("numero2") String numero2) {

		logger.info("Calculando...  " + numero1 + " * " + numero2);

		if (!ConversorNumerico.ehNumerico(numero1) || !ConversorNumerico.ehNumerico(numero2)) {
			return 0d;
		}
		return Calculadora.multiplicar(ConversorNumerico.converterParDouble(numero1),
				                      ConversorNumerico.converterParDouble(numero2));
	}

//---------------------DIVIDIR----------------------------------------------------------------------------------------//
	@GetMapping("/dividir-query")
	public Double dividirQuery(@RequestParam(value = "numero1", defaultValue = "0") Double numero1,
			@RequestParam(value = "numero2", defaultValue = "0") Double numero2) {
		return Calculadora.dividir(numero1, numero2);

	}

	@RequestMapping(value = "/dividir-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double dividirPath(@PathVariable("numero1") String numero1, @PathVariable("numero2") String numero2) {

		logger.info("Calculando a média de " + numero1 + " e " + numero2);

		if (!ConversorNumerico.ehNumerico(numero1) || !ConversorNumerico.ehNumerico(numero2)) {
			return 0d;
		}
		return Calculadora.dividir(ConversorNumerico.converterParDouble(numero1),
				                      ConversorNumerico.converterParDouble(numero2));
	}

//---------------------MÉDIA----------------------------------------------------------------------------------------//
	@GetMapping("/media-query")
	public Double mediaQuery(@RequestParam(value = "numero1", defaultValue = "0") Double numero1,
			@RequestParam(value = "numero2", defaultValue = "0") Double numero2) {

		return Calculadora.media(numero1, numero2);

	}

	@RequestMapping(value = "/media-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double mediaPath(@PathVariable("numero1") String numero1, @PathVariable("numero2") String numero2) {

		logger.info("Calculando a média de " + numero1 + " e " + numero2);

		if (!ConversorNumerico.ehNumerico(numero1) || !ConversorNumerico.ehNumerico(numero2)) {
			return 0d;
		}
		return Calculadora.media(ConversorNumerico.converterParDouble(numero1),
				                ConversorNumerico.converterParDouble(numero2));
	}

//---------------------POTENCIAÇÃO----------------------------------------------------------------------------------------//
	@GetMapping("/potencia-query")
	public Double potenciaQuery(@RequestParam(value = "numero1", defaultValue = "0") Double numero1,
			@RequestParam(value = "numero2", defaultValue = "0") Double numero2) {
		return Calculadora.potencia(numero1, numero2);

	}

	@RequestMapping(value = "/potencia-path/{numero1}/{numero2}", method = RequestMethod.GET)
	public Double potenciaPath(@PathVariable("numero1") String numero1, @PathVariable("numero2") String numero2) {

		logger.info("Calculando " + numero1 + " elevado a " + numero2 + "ª potência");

		if (!ConversorNumerico.ehNumerico(numero1) || !ConversorNumerico.ehNumerico(numero2)) {
			return 0d;
		}
		return Calculadora.potencia(ConversorNumerico.converterParDouble(numero1), 
				                   ConversorNumerico.converterParDouble(numero2));
	}

	// ---------------------RAIZ QUADRADA----------------------------------------------------------------------------------------//
	@GetMapping("/raiz-query")
	public Double raizQuery(@RequestParam(value = "numero", defaultValue = "0") Double numero) {
//		try {
//			Calculadora.raizQuadrada(numero);
//			System.out.println("Verificação finalizada com sucesso!");
//			
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			
//		}
		
		return Calculadora.raizQuadrada(numero);

	}

	@RequestMapping(value = "/raiz-path/{numero}", method = RequestMethod.GET)
	public Double raizPath(@PathVariable("numero") String numero) {

		logger.info("Calculando a raiz quadrada de: " + numero);

		if (!ConversorNumerico.ehNumerico(numero)) {
			return 0d;
		}

		return Calculadora.raizQuadrada(ConversorNumerico.converterParDouble(numero));
	}

}