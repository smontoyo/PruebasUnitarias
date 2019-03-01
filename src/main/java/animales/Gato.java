package animales;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Gato extends Animal{
	
	private static final Logger LOG = Logger.getLogger(Gato.class.getName());
	
	@Override
	public String hacerRuido() {
		String ruido = "meow meow";
		LOG.log(Level.INFO, ruido);
		return ruido;
	}

}
