package com.krakedev.test;

import com.krakedev.Persona;

public class TestPersona {

	public static void main(String[] args) {

		Persona p;// creo una variable p de tipo persona
		Persona p2 = new Persona();
		Persona p3 = new Persona("Luis");
		Persona p4 = new Persona("Roberto",18,1.80);
		
		p = new Persona();// creo o intancio un objeto Persona, referencio con p
		System.out.println("nombre: " + p.getNombre());
		System.out.println("edad: " + p.getEdad());
		System.out.println("estatura: " + p.getEstatura());

		p.setNombre("Juan");
		p.setEdad(21);
		p.setEstatura(1.72);
		System.out.println("******************************");
		System.out.println("nombre: " + p.getNombre());
		System.out.println("edad: " + p.getEdad());
		System.out.println("estatura: " + p.getEstatura());

		p2.setNombre("Isaac");
		System.out.println("******************************");
		System.out.println("p.nombre: " + p.getNombre());
		System.out.println("p2.nombre: " + p2.getNombre());
		System.out.println("******************************");

		
	}
}