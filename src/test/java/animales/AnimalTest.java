package animales;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import animales.Animal;

public class AnimalTest {

private Animal animal;
	
	@Before
	public void setUp() {
		animal = new Animal();
	}
	
	@Test
	public void hacerRuidoPerro() {
		String resultadoEsperado = "Animal hace ruido";
		String resultado = animal.hacerRuido();
		Assert.assertEquals(resultadoEsperado, resultado);
	}
	
}
