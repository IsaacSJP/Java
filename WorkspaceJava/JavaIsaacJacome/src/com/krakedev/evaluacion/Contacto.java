package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private String tipo;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public Contacto(String cedula, String nombre, String apellido) {
		this.telefonos = new ArrayList<Telefono>();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void imprimir() {
		System.out.println("Cedula:"+cedula+"\nNombre: " + nombre + "\nApellido: " + apellido);
		if (direccion != null) {
			direccion.imprimir();
		} else {
			System.out.println("no tiene asociada una direccion");
		}
	}
/*
	public void imprimir() {
		System.out.println("************ " + nombre + " " + apellido + "**********");
		if (direccion != null) {
			System.out.println("Direccion: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
		} else {
			System.out.println("no tiene asociada una direccion");
		}
	}
*/
	public void agregarTelefono(Telefono telefonoN) {
		telefonos.add(telefonoN);
	}

	public void mostrarTelefonos() {
		ArrayList<Telefono> telfTipoC = new ArrayList<Telefono>();
		for (int i = 0; i < telefonos.size(); i++) {
			if (telefonos.get(i).getEstado().contentEquals("C")) {
				telfTipoC.add(telefonos.get(i));
			} else {
			}
		}
		System.out.println("Telefonos con estado 'C':");
		for (int i = 0; i < telfTipoC.size(); i++) {
			System.out.println("Numero: " + telfTipoC.get(i).getNumero() + ", Tipo: " + telfTipoC.get(i).getTipo());
		}
	}

	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> telfTipoE = new ArrayList<Telefono>();
		for (int i = 0; i < telefonos.size(); i++) {
			if (telefonos.get(i).getEstado().contentEquals("E")) {
				telfTipoE.add(telefonos.get(i));
			} else {
			}
		}
		return telfTipoE;
	}
}
