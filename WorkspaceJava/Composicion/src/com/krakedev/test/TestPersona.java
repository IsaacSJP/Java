package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1=new Persona();
		
		p1.setNombre("Rosario");
		p1.setApellido("Proaño");
		
		Direccion dir=new Direccion();
		dir.setCallePrincipal("calle FAlarcon");
		dir.setCalleSecunaria("P S12");
		dir.setNumero("O-10");
		p1.setDireccion(dir);
		
		String nombre=p1.getNombre();
		Direccion d1=p1.getDireccion();
		System.out.println(nombre);
		p1.imprimir();
		Persona p2=new Persona();
		p2.setNombre("felipe");
		Direccion d2=new Direccion("AV 12","calle 13","S/N");
		p2.setDireccion(d2);
		p2.imprimir();
		System.out.println(d1.getCallePrincipal());
		Persona p3=new Persona();
		p3.setDireccion(new Direccion("principal","secundaria","S/N"));
		p3.imprimir();
	}

}
