package com.clearminsd.test;

import com.clearminsd.componentes.Celda;
import com.clearminsd.componentes.Producto;
import com.clearminsd.maquina.MaquinaDulces;

public class TestBuscarCeldaProducto {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("B1"));
		maquina.agregarCelda(new Celda("B2"));

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "B1", 4);

		Celda celda = maquina.buscarCeldaProducto("KE34");
		System.out.println("Celda que contiene el producto: " + celda.getCodigo());

	}

}
