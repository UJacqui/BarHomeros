package ar.edu.unlam.pb2.bar;

import java.util.Set;
import java.util.TreeSet;

public class Bar {
	private Set<Persona> clientes = new TreeSet<Persona>();

	public void ingresarCliente(Persona cliente) {
		this.clientes.add(cliente);

	}

	public Integer obtenerCantidadDeClienetes() {
		return this.clientes.size();
	}

	public TreeSet<Persona> obtenerClientes() {
		return (TreeSet<Persona>) this.clientes;
	}
}
