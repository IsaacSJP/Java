package com.kakredev.controlflujo.test;

import com.kakredev.controlflujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		
		Validador validador=new Validador();
		validador.validarEdad(10);
		validador.validarEdad(18);
		validador.validarEdad(20);
		validador.validarEdad(16);
		validador.validarEdad(-3);
		
	}

}
