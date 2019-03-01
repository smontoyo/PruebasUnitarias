package animales;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import animales.Animal;
import animales.Perro;

public class PerroTest {

	private Animal perro;
	
	@Before
	public void setUp() {
		perro = new Perro();
	}
	
	@Test
	public void hacerRuidoPerro() {
		String resultadoEsperado = "Guau Guau";
		String resultado = perro.hacerRuido();
		Assert.assertEquals(resultadoEsperado, resultado);
	}
}
