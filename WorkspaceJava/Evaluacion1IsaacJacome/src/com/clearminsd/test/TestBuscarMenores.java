package com.clearminsd.test;

import java.util.ArrayList;

import com.clearminsd.componentes.Celda;
import com.clearminsd.componentes.Producto;
import com.clearminsd.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("A3"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
        maquina.agregarCelda(new Celda("B3"));
        Producto producto1 = new Producto("KE31", "Papitas", 0.85);
        Producto producto2 = new Producto("KE32", "Chocaletes", 0.75);
        Producto producto3 = new Producto("KE33", "Gelletas", 0.50);
        Producto producto4 = new Producto("KE34", "Caramelo", 0.25);
        Producto producto5 = new Producto("KE35", "Gomitas", 0.15);
        Producto producto6 = new Producto("KE36", "Mani", 0.35);
        
		maquina.cargarProducto(producto1, "A1", 4);
		maquina.cargarProducto(producto2, "A2", 5);
		maquina.cargarProducto(producto3, "A3", 6);
		maquina.cargarProducto(producto4, "B1", 7);
		maquina.cargarProducto(producto5, "B2", 8);
		maquina.cargarProducto(producto6, "B3", 9);
		
		ArrayList<Producto> productosMenores=maquina.buscarMenores(0.50);
		Producto elementoProducto;
		System.out.println("hay "+productosMenores.size()+" productos menoras a 0.50");
		for (int i=0;i<productosMenores.size();i++) {
			elementoProducto=productosMenores.get(i);
			System.out.println("Nombre: "+elementoProducto.getNombre()+" Procio: "+elementoProducto.getPrecio());
		}
	}

}
