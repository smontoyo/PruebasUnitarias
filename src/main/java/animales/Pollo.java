package animales;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Pollo extends Animal{

	private static final Logger LOG = Logger.getLogger(Pollo.class.getName());

	@Override
	public String hacerRuido() {
		String ruido = "Pio Pio";
		LOG.log(Level.INFO, ruido);
		return ruido;
	}
}
