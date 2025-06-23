package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante est1=new Estudiante("Juan");
		Estudiante est2=new Estudiante("Juan");
		Estudiante est3=new Estudiante("Juan");
		est1.calificar(8);
		System.out.println(est1.getResultado());
		est2.calificar(5);
		System.out.println(est2.getResultado());
		est3.calificar(-1);
		System.out.println(est3.getResultado());
		
		
	}

}
