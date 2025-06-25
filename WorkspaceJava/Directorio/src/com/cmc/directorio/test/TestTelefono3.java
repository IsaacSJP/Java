package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("movi","0912345678",1001);
		Telefono telf2=new Telefono("movi","0912345671",1002);
		Telefono telf3=new Telefono("movi","0912345672",1003);
		AdminTelefono admin=new AdminTelefono();
		int contador=admin.contarMovi(telf1, telf2, telf3);
		System.out.println("hay "+contador+" telefonos con opreradora 'movi'");
	}

}
