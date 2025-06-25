package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono tel1=new Telefono("movi","0912345672",1002);
		
		Contacto con1=new Contacto("Pepe","Alvares",tel1,65.1);
		System.out.println(con1.isActivo());
		AdminContactos admin=new AdminContactos();
		tel1.setTieneWhatsapp(true);
		admin.activarUsuario(con1);
		System.out.println(con1.isActivo());
		
	}

}
