package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin=new AdminPersonas();
		admin.agregar(new Persona("Mario","Benedetti",50));		admin.agregar(new Persona("Isaac","Punina",18));		admin.agregar(new Persona("Juan","Perez",25));		admin.agregar(new Persona("Luis","Proaño",20));		admin.agregar(new Persona("Felipe","Ramirez",30));
		admin.imprimir();
		
		Persona p1=admin.buscarProNombre("Luis");
		if (p1!=null) {
			System.out.println("encontrado: "+p1.getApellido()+" "+p1.getEdad());
		}else {
			System.out.println("no encontrado");
		}
		ArrayList<Persona> personasMayores=admin.buscarMayores(25);
		System.out.println("mayores de 25: "+personasMayores.size());
		
	}

}
