package matematicas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import matematicas.Calculadora;

public class CalculadoraTest {

	private Calculadora calculadora = null;
	
	@Before
	public void setUp() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void sumarUnoMasDosIgualTres_Test() {
		int factor1 = 1;
		int factor2 = 2;
		int resultadoEsperado = 3;
		int resultado = calculadora.sumar(factor1, factor2);
		Assert.assertEquals(resultado, resultadoEsperado);
	}
	
	@Test
	public void restarTresMenosUnoIgualDos_Test() {
		int factor1 = 3;
		int factor2 = 1;
		int resultadoEsperado = 2;
		int resultado = calculadora.restar(factor1, factor2);
		Assert.assertEquals(resultado, resultadoEsperado);
	}
}
