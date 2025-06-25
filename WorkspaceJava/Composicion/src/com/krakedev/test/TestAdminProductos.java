package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProductos {

	public static void main(String[] args) {
		Producto mc;
		AdminProducto admin=new AdminProducto();
		Producto productoA=new Producto("lapiz",0.5);
		Producto productoB=new Producto("borrador",0.5);
		
		mc=admin.buscarMasCaro(productoA, productoB);
		if (mc==null) {
		System.out.println("tienen el mismi precio");
		}else {
			System.out.println("El producto màs caro es: "+mc.getNombre());
		}
	}

}
