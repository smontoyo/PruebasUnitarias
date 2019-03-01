package matematicas;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculadora {
	
	private static final Logger LOG = Logger.getLogger(Calculadora.class.getName());
	
	public int sumar(int factor1, int factor2) {
		int resultado = 0;
		resultado = factor1 + factor2;
		String mensaje = "La suma de " + factor1 + " + " +  factor2 + " es: " + resultado;
		LOG.log(Level.INFO, mensaje);
		return resultado;
	}
	
	public int restar(int factor1, int factor2) {
		int resultado = 0;
		if(factor1 < factor2) {
			resultado = factor2 - factor1;
		} else {
			resultado = factor1 - factor2;
		}
		String mensaje = "La resta de " + factor1 + " - " +  factor2 + " es: " + resultado;
		LOG.log(Level.INFO, mensaje);
		return resultado;
	}
	
	public int multiplicar(int factor1, int factor2) {
		int resultado = 0;
		resultado = factor1 * factor2;
		String mensaje = "La multiplicación de " + factor1 + " * " +  factor2 + " es: " + resultado;
		LOG.log(Level.INFO, mensaje);
		return resultado;
	}
	
	public int division(int factor1, int factor2) {
		int resultado = 0;
		String mensaje;
		if(factor1 < factor2) {
			resultado = factor2 / factor1;
			mensaje = "La división de " + factor2 + " / " +  factor1 + " es: " + resultado;
			LOG.log(Level.INFO, mensaje);
		} else {
			resultado = factor1 / factor2;
			mensaje = "La división de " + factor1 + " + " +  factor2 + " es: " + resultado;
			LOG.log(Level.INFO, mensaje);
		}
		return resultado;
	}

}
