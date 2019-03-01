package operaciones.animales;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Perro extends Animal {
	
	private static final Logger LOG = Logger.getLogger(Perro.class.getName());

	@Override
	public String hacerRuido() {
		String ruido = "Guau Guau";
		LOG.log(Level.INFO, ruido);
		return ruido;
	}
	
	

}
