package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {
	
	public static void main(String[] args) {
		Telefono tel1=new Telefono("claro","0912345671",1001);
		Telefono tel2=new Telefono("movi","0912345672",1002);
		
		Contacto con1=new Contacto("Juan","Alvares",tel1,65.1);
		Contacto con2=new Contacto("Daria","Jacome",tel2,50.98);
		
		AdminContactos admin=new AdminContactos();
		Contacto contMasPesado=admin.buscarMasPeso(con1, con2);
		boolean comparacion=admin.compararOperadoras(con1, con2);
		System.out.println(comparacion);
		System.out.println(contMasPesado.getNombre());
		
	}

}
