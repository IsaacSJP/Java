package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class testProducto {

	public static void main(String[] args) {
		Producto p1=new Producto("lapiz",0.30);
		Producto p2=new Producto("pinturas",1.2);
		double descuento;
		
		p1.setPrecio(0);
		p1.setPrecio(0.2);
		descuento=p2.calcularPresioPromo(10);
		System.out.println(p1.getPrecio());
		System.out.println(descuento);
	}
}
