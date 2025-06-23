package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProductos {

	public static void main(String[] args) {
		Producto p1=new Producto(123,"lapiz");
		p1.setDescripcion("se usa para escribir");
		p1.setPeso(0.20);
		
		System.out.println("el codigo es: "+p1.getCodigo());
		System.out.println("el nombre es: "+p1.getNombre());
		System.out.println("el descripcion es: "+p1.getDescripcion());
		System.out.println("el peso es: "+p1.getPeso());
		
	}

}
