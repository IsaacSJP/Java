package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion val=new Validacion();
		boolean a,b,c;
		a=val.validarMonto(0);
		b=val.validarMonto(10);
		c=val.validarMonto(-10);
		System.out.println("debug!!!!!!");
	}

}
