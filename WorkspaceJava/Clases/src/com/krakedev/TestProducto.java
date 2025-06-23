package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		productoA=new Producto();
		Producto productoB;
		productoB=new Producto();
		Producto productoC;
		productoC=new Producto();
		
		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("Analgesico");
		productoA.setPrecio(1.50);
		productoA.setStockActual(120);

		productoB.setNombre("Ibuprofeno");
		productoB.setDescripcion("Antiinflamatorio");
		productoB.setPrecio(2.00);
		productoB.setStockActual(80);
		
		productoC.setNombre("Omeprazol");
		productoC.setDescripcion("Protector gástrico");
		productoC.setPrecio(3.00);
		productoC.setStockActual(60);
		
		System.out.println("productoA.nombre: "+productoA.getNombre());
		System.out.println("productoA.descripcion: "+productoA.getDescripcion());
		System.out.println("productoA.precio: "+productoA.getPrecio());
		System.out.println("productoA.stockActual: "+productoA.getStockActual());
		System.out.println("*******************");
		System.out.println("productoB.nombre: "+productoB.getNombre());
		System.out.println("productoB.descripcion: "+productoB.getDescripcion());
		System.out.println("productoB.precio: "+productoB.getPrecio());
		System.out.println("productoB.stockActual: "+productoB.getStockActual());
		System.out.println("*******************");
		System.out.println("productoC.nombre: "+productoC.getNombre());
		System.out.println("productoC.descripcion: "+productoC.getDescripcion());
		System.out.println("productoC.precio: "+productoC.getPrecio());
		System.out.println("productoC.stockActual: "+productoC.getStockActual());
	}
}