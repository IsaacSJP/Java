package krakedev.entidades;

import java.util.ArrayList;

public class Estudiantes {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Notas> notas;

	public Estudiantes(String cedula, String nombre, String apellido) {
		this.notas = new ArrayList<Notas>();
		this.nombre = nombre;
		this.apellido = apellido;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Notas> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Notas> notas) {
		this.notas = notas;
	}

	public void agregarNota(Notas notaN) {
		boolean codigoRepetido = false;
		Notas elementoNota;
		String codigoMateria;
		String codigoMateriaN = notaN.getMateria().getCodigo();
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			codigoMateria = elementoNota.getMateria().getCodigo();
			if (codigoMateria.contentEquals(codigoMateriaN)) {
				codigoRepetido = true;
			} else {
			}
		}
		if ((notaN.getNota() >= 0 && notaN.getNota() >= 10) && codigoRepetido == false) {
			notas.add(notaN);
		}
	}

	public void modificarNota(String codigo, double notaN) {
		Materia elementoMateria = null;

		if (notaN >= 0 && notaN <= 10) {
			for (int i = 0; i < notas.size(); i++) {
				elementoMateria = notas.get(i).getMateria();
				if (codigo.contentEquals(elementoMateria.getCodigo())) {
					notas.get(i).setNota(notaN);
					System.out.println("nota de " + elementoMateria.getNombre() + " se actializo");
				}
			}
		} else {
			System.out.println("nota fuera del rango");
		}
	}

	public double calcularPromedioNotasEstudiante() {
		double promedio = 0;
		Notas elementoNota;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			promedio += elementoNota.getNota();
		}
		promedio = promedio / notas.size();
		return promedio;
	}

	public void mostrar() {
		String mensaje = "Nombre: ";
		mensaje += this.nombre + " " + this.apellido + " Cedula: " + this.cedula;
		for (int i = 0; i < notas.size(); i++) {
			mensaje += " Nota" + (i + 1) + " " + notas.get(i).getMateria().getNombre() + " " + notas.get(i).getNota();
		}
		System.out.println(mensaje);
	}

}
