package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas;
		personas=new ArrayList<Persona>();
		
		
		personas.add(new Persona("Isaac","Punina"));
		personas.add(new Persona("Juan","Perez"));
		personas.add(new Persona("Luis","Proaño"));
		personas.add(new Persona("Felipe","Ramirez"));
		
		Persona elementoPersona;
		for (int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			System.out.println(elementoPersona.getNombre()+"-"+elementoPersona.getApellido());
		}
	}

}
