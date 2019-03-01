package animales;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import animales.Animal;
import animales.Gato;

public class GatoTest {

	private Animal gato = null;
	
	@Before
	public void setUp () {
		gato = new Gato();
	}
	
	@Test
	public void hacerRuidoGato () {
		String resultadoEsperado = "meow meow";
		String resultado = gato.hacerRuido();
		Assert.assertEquals(resultadoEsperado, resultado);
	}
	
}
