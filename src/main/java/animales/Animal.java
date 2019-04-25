package animales;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Animal {
	
	private static final Logger LOG = Logger.getLogger(Animal.class.getName());

	
	//Comentario de prueba 1111
	public String hacerRuido() {
		String ruido = "Animal hace ruido";
		LOG.log(Level.INFO, ruido);
		return ruido;
	}
	
	
	//Cometario para
	public String silenciarRuido() {
		String ruido = "Animal sin ruido";
		LOG.log(Level.INFO, ruido);
		return ruido;
	}
}
