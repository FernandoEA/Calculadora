package pruebas;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	
	static Calculadora c;
	
	@BeforeClass //De Jupiter es @BeforeAll
	static void init(){
		c = new Calculadora();
	}

	@Test
	public void test() {
		Calculadora c = new Calculadora();
		c.setOperacion(Operaciones.DIVISION);
		assertEquals(3, c.resultado(6,3));
		assertEquals(5, c.resultado(3,3));
	}
	
	@Test
	public void test2(){
		
		/*assertAll(
				() -> assertTrue(false),
				() -> assertFalse(true)				
				);*/ //Para Jupiter 
		
	}
	

}
