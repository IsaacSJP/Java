package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono telef=new Telefono("claro","0945678912",201);
		Contacto c=new Contacto("Steven","Punina",telef,1.20);
		
		System.out.println(c.getNombre());
		System.out.println(c.getApellido());
		System.out.println(c.getPeso());
		System.out.println(telef.getNumero());
		System.out.println(telef.getOperadora());
		
	}

}
