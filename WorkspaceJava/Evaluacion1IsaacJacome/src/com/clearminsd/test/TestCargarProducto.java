package com.clearminsd.test;

import com.clearminsd.componentes.Celda;
import com.clearminsd.componentes.Producto;
import com.clearminsd.maquina.MaquinaDulces;

public class TestCargarProducto {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A"));
        maquina.agregarCelda(new Celda("B"));
        maquina.agregarCelda(new Celda("C"));
        maquina.agregarCelda(new Celda("D"));

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "B", 4);
		Producto producto2 = new Producto("PRTO", "Gatorade", 2.54);
		maquina.cargarProducto(producto2, "D", 5);

		maquina.mostrarProductos();
	}

}
