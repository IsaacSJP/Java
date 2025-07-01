package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;
	
	

	public Directorio() {
		contactos = new ArrayList<Contacto>();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/*
	 public boolean agregarContacto(Contacto contactoN) {
		contactos.add(contactoN);
		return true;
	 }
	 */

	public Contacto buscarPorCedula(String cedula) {
		Contacto contactoEncontrado = null;
		for (int i = 0; i < contactos.size(); i++) {
			if (cedula.equals(contactos.get(i).getCedula())) {
				contactoEncontrado = contactos.get(i);
			} else {
			}
		}
		return contactoEncontrado;
	}

	public boolean agregarContacto(Contacto contactoN) {
		if (buscarPorCedula(contactoN.getCedula())==null) {
			contactos.add(contactoN);
			this.fechaModificacion=new Date();
			return true;
		}else {
			return false;
		}
	}
	public String consultarUltimaModificacion() {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String fechaFormat=formato.format(fechaModificacion);
		return fechaFormat;
	}
	
	public int contarPerdidos(){
		ArrayList<Contacto> CPerdidos=new ArrayList<Contacto>();
		int numCP=0;
		for (int i=0;i<contactos.size();i++) {
			if (contactos.get(i).getDireccion()==null) {
				CPerdidos.add(contactos.get(i));
			}
		}
		numCP=CPerdidos.size();
		return numCP;
	}
	public int contarFijos() {
		int fijos=0;
		for (int i=0;i<contactos.size();i++) {
			if (contactos.get(i).getTelefonos().get(0).getTipo().equals("Convencional")&&contactos.get(i).getTelefonos().get(0).getEstado().equals("C")) {
				fijos++;
			}
		}
		return fijos;
	}
	
	public void depurar() {
		for (int i=0;i<contactos.size();i++) {
			if (contactos.get(i).getDireccion()!=null) {
				correctos.add(contactos.get(i));
			}else if(contactos.get(i).getDireccion()==null){
				incorrectos.add(contactos.get(i));
			}
		}
		setContactos(new ArrayList<Contacto>());
	}
}
