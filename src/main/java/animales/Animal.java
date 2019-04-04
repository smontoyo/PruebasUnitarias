package animales;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Animal {
	
	private static final Logger LOG = Logger.getLogger(Animal.class.getName());

	public String hacerRuido() {
		String ruido = "Animal hace ruido";
		LOG.log(Level.INFO, ruido);
		return ruido;
	}
	
	public String silenciarRuido() {
		String ruido = "Animal sin ruido";
		LOG.log(Level.INFO, ruido);
		return ruido;
	}
}