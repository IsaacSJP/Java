package com.clearminsd.test;

import com.clearminsd.componentes.Celda;
import com.clearminsd.maquina.MaquinaDulces;

public class TestMaquinaDulces {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
        maquina.agregarCelda(new Celda("A"));
        maquina.agregarCelda(new Celda("B"));
        maquina.agregarCelda(new Celda("C"));
        maquina.agregarCelda(new Celda("D"));
        maquina.mostrarConfiguracion();
	}

}
