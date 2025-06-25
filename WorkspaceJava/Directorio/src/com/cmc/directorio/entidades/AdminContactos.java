package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPeso(Contacto c1,Contacto c2) {
		if (c1.getPeso()>c2.getPeso()) {
			return c1;	
		}else if(c2.getPeso()>c1.getPeso()) {
			return c2;
		}else {
			System.out.println("tienen el mismo peso");
			return null;
		}
	}
	
	public boolean compararOperadoras(Contacto c1,Contacto c2) {
		Telefono tel1=c1.getTelefono();
		Telefono tel2=c2.getTelefono();
		if(tel1.getOperadora()==tel2.getOperadora()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void activarUsuario(Contacto c1) {
		Telefono tel =c1.getTelefono();
		if(tel.isTieneWhatsapp()) {
			c1.setActivo(true);
		}else {}
	}
}
