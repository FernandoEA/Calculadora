package pruebas;

import enumeraciones.*;

public class Test {
	
	public static void main(String[] args){
		
		Calculadora c = new Calculadora();
		
		System.out.println("Seleccione operacion: ");
		String operacion = leer.nextLine().toUpperCase();
		
		System.out.println("Escribe el operador 1: ");
		double ope1.leer.nextDouble();
		
		System.out.println("Escribe el operador 2: ");
		double ope2.leer.nextDouble();
		
		c.setOperacion(Operaciones.valueOf(operacion));
		System.out.println(c.resultado(ope1,ope2));
		
	}
	
	

}
