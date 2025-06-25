package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("movi","0912345678",1001);
		Telefono telf2=new Telefono("claro","0912345671",1002);
		Telefono telf3=new Telefono("movi","0912345672",1003);
		Telefono telf4=new Telefono("claro","0912345673",1004);
		AdminTelefono admin=new AdminTelefono();
		int contador=admin.contarClaro(telf1, telf2, telf3,telf4);
		System.out.println("hay "+contador+" telefonos con opreradora 'claro'");	
	}
}
