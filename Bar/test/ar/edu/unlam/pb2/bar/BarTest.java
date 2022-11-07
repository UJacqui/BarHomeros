package ar.edu.unlam.pb2.bar;

import org.junit.Assert;
import org.junit.Test;

public class BarTest {
	@Test
	public void queNoAdmitaDuplicados() {
		Bar bar = new Bar();
		Persona homero = new Persona("Homero");
		Persona otroHomero = new Persona("Homero");

		bar.ingresarCliente(homero);
		bar.ingresarCliente(otroHomero);

		Integer valorEsperado = 1;
		Integer valorObtenido = bar.obtenerCantidadDeClienetes();
		Assert.assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queAdmitaDistintos() {
		Bar bar = new Bar();
		Persona homero = new Persona("Homero");
		Persona marcelo = new Persona("Marcelo");

		bar.ingresarCliente(homero);
		bar.ingresarCliente(marcelo);

		Integer valorEsperado = 2;
		Integer valorObtenido = bar.obtenerCantidadDeClienetes();
		Assert.assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSePresentenOrdenados() {
		Bar bar = new Bar();
		Persona homero = new Persona("Homero");
		Persona marcelo = new Persona("Marcelo");

		bar.ingresarCliente(marcelo);

		bar.ingresarCliente(homero);

		String valorEsperado = "Homero";
		Persona valorObtenido = bar.obtenerClientes().first();
		Assert.assertEquals(valorEsperado, valorObtenido.getNombre());
	}
}
